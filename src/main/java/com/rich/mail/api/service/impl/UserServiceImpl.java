package com.rich.mail.api.service.impl;

import com.rich.mail.api.code.CodeUtils;
import com.rich.mail.api.code.Codes;
import com.rich.mail.api.domain.CustomUserEntity;
import com.rich.mail.api.param.LoginParm;
import com.rich.mail.api.param.RegisteredCode;
import com.rich.mail.api.param.RegisteredParam;
import com.rich.mail.api.param.SendParam;
import com.rich.mail.api.repository.CustomUserRepository;
import com.rich.mail.api.response.UserInfo;
import com.rich.mail.api.service.SmsService;
import com.rich.mail.api.service.UserService;
import com.rich.mail.api.utils.RandomUtils;
import com.rich.mail.api.utils.RedisKey;
import com.rich.mail.api.utils.TokenUtils;
import org.apache.commons.lang3.StringUtils;
import org.jasypt.util.text.AES256TextEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private CustomUserRepository customUserRepository;

    @Autowired
    private TokenUtils tokenUtils;

    @Autowired
    private AES256TextEncryptor aes256TextEncryptor;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;


    @Autowired
    private SmsService smsService;

    public Object sendCode(SendParam sendParam){
        return smsService.sendCode(sendParam.getType(),sendParam.getPhone());
    }

    @Override
    public Object login(LoginParm loginParm) {
        CustomUserEntity userEntity = customUserRepository.findCustomByPhone(loginParm.getPhone());
        if (Objects.isNull(userEntity)) {
            return CodeUtils.EXIST();
        }
        if (loginParm.getType() == 1) {
//            String decryptPassword = aes256TextEncryptor.decrypt(userEntity.getUserPass());
            if (userEntity.getUserPass().equals(loginParm.getPassword())) {
                String token = createToken(userEntity.getPhone(), new HashMap<String, Object>() {
                    {
                        put("userId", userEntity.getId());
                    }
                });
                redisTemplate.opsForValue().set(RedisKey.USER_TOKEN + userEntity.getId(), token, 3, TimeUnit.DAYS);
                return CodeUtils.SUCCESS(token);
            } else {
                return CodeUtils.Unauthorized();
            }
        } else if (loginParm.getType() == 2) {
            String code = redisTemplate.opsForValue().get(RedisKey.USER_LOGIN_CODE + userEntity.getPhone());
            if (StringUtils.isEmpty(code)) {
                return CodeUtils.EXIST();
            }
            if (loginParm.getPassword().equals(code)) {
                String token = createToken(userEntity.getPhone(), new HashMap<String, Object>() {
                    {
                        put("userId", userEntity.getId());
                        put("phone", userEntity.getPhone());
                    }
                });
                redisTemplate.opsForValue().set(RedisKey.USER_TOKEN + userEntity.getId(), token, 3, TimeUnit.DAYS);
                return CodeUtils.SUCCESS(token);
            } else {
                return CodeUtils.CODE_ERROR();
            }
        } else {
            return CodeUtils.PARAM_ERROR();
        }
    }

    private String createToken(String phone, Map<String, Object> infos) {
        return tokenUtils.createToken(phone, infos);
    }

    @Override
    public Object registered(RegisteredParam registeredParam) {

        String phoneCode = redisTemplate.opsForValue().get(RedisKey.USER_REGISTERED_CODE + registeredParam.getPhone());
        if (StringUtils.isEmpty(phoneCode)) {
            return CodeUtils.CODE_ERROR();
        }
        if (!registeredParam.getPhoneCode().equals(phoneCode)) {
            return CodeUtils.CODE_ERROR();
        }
        CustomUserEntity parentUser = customUserRepository.findCustomUserByCode(registeredParam.getCode());

        if (Objects.isNull(parentUser)) {
            return CodeUtils.EXIST();
        }
        int userCount = customUserRepository.findCustomUserByUserName(registeredParam.getUserName());
        if (userCount > 0) {
            return CodeUtils.USER_NAME_ERROR();
        }
        int code = RandomUtils.generateCode();
        CustomUserEntity nowUser = registeredParam.setCustomUserEntity(parentUser.getId(), String.valueOf(code));
        customUserRepository.save(nowUser);
        return CodeUtils.SUCCESS();
    }

    @Override
    public Object userInfo(CustomUserEntity customUserEntity) {
        if (Objects.isNull(customUserEntity)) {
            return CodeUtils.EXIST();
        }
        UserInfo userInfo = UserInfo.toUserInfo(customUserEntity);
        return CodeUtils.SUCCESS(userInfo);
    }


    @Override
    public Object checkCode(String code) {
        CustomUserEntity user = customUserRepository.findCustomUserByCode(code);
        if (Objects.isNull(code)) {
            return CodeUtils.EXIST();
        }
        return CodeUtils.SUCCESS();
    }

    @Override
    public Object checkRegisteredCode(RegisteredCode registeredCode) {
        String phoneCode = redisTemplate.opsForValue().get(RedisKey.USER_REGISTERED_CODE + registeredCode.getPhone());
        if (StringUtils.isEmpty(phoneCode)) {
            return CodeUtils.CODE_ERROR();
        }
        if (!registeredCode.getCode().equals(phoneCode)) {
            return CodeUtils.CODE_ERROR();
        }
        return CodeUtils.SUCCESS();
    }


}
