package com.rich.mail.api.service.impl;

import com.rich.mail.api.service.SmsService;
import com.rich.mail.api.utils.RandomUtils;
import com.rich.mail.api.utils.RedisKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class SmsServiceImpl implements SmsService {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Override
    public String sendCode(Integer type, String phone) {
        String code = String.valueOf(RandomUtils.generateCheckCode());
        if (type == 1) {
            redisTemplate.opsForValue().set(RedisKey.USER_LOGIN_CODE + phone, code, 3, TimeUnit.MINUTES);
        } else if (type == 2) {
            redisTemplate.opsForValue().set(RedisKey.USER_REGISTERED_CODE + phone, code, 3, TimeUnit.MINUTES);
        }
        return code;
    }
}
