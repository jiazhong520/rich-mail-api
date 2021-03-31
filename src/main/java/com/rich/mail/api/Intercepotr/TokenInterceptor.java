package com.rich.mail.api.Intercepotr;



import com.rich.mail.api.code.Codes;
import com.rich.mail.api.domain.CustomUserEntity;
import com.rich.mail.api.repository.CustomUserRepository;
import com.rich.mail.api.utils.Contract;
import com.rich.mail.api.utils.RedisKey;
import com.rich.mail.api.utils.TokenUtils;
import io.jsonwebtoken.Claims;
import lombok.extern.log4j.Log4j2;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Objects;

@Log4j2
@Component
public class TokenInterceptor implements HandlerInterceptor {

    @Autowired
    private TokenUtils tokenUtils;

    @Autowired
    private CustomUserRepository customUserRepository;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-Type", "application/json");
        String token = request.getHeader(Contract.handleTokenName);

        if (StringUtils.isEmpty(token)) {
            PrintWriter writer = response.getWriter();
            writer.write(Codes.not_login.toString());
            writer.flush();
            return false;
        }
        Claims tokenClaim = tokenUtils.getTokenClaim(token);
        if (Objects.isNull(tokenClaim)) {
            PrintWriter writer = response.getWriter();
            writer.write(Codes.not_login.toString());
            writer.flush();
            return false;
        }
        CustomUserEntity customUser = customUserRepository.getCustomUserEntitiesById(((Integer) tokenClaim.get(Contract.user)).longValue());
        if (Objects.isNull(customUser)) {
            PrintWriter writer = response.getWriter();
            writer.write(Codes.not_login.toString());
            writer.flush();
            return false;
        }

        String redisToken = redisTemplate.opsForValue().get(RedisKey.USER_TOKEN + customUser.getId());
        if(StringUtils.isEmpty(redisToken)){
            PrintWriter writer = response.getWriter();
            writer.write(Codes.not_login.toString());
            writer.flush();
            return false;
        }
        if (!redisToken.equals(token)) {
            PrintWriter writer = response.getWriter();
            writer.write(Codes.ER_LOGIN.toString());
            writer.flush();
            return false;
        }

        request.setAttribute(Contract.user, customUser);

        return true;
    }

}
