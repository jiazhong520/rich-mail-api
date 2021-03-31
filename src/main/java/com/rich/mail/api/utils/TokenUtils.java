package com.rich.mail.api.utils;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.Data;
import org.jasypt.util.text.AES256TextEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Map;

/**
 * JWT的token，区分大小写
 */
@ConfigurationProperties(prefix = "config.jwt")
@Component
@Data
public class TokenUtils {

    private String secret;
    private long expire;
    private String header;
    @Autowired
    private AES256TextEncryptor aes256TextEncryptor;
    /**
     * 生成token
     * @param subject
     * @return
     */
    public String createToken (String subject, Map<String,Object> userInfo){
        Date nowDate = new Date();
        Date expireDate = new Date(nowDate.getTime() + expire * 1000);//过期时间
        String compact = Jwts.builder()
                .setIssuedAt(new Date())
                .setHeaderParam("typ", "JWT")
                .setSubject(subject)
                .setExpiration(expireDate)
                .signWith(SignatureAlgorithm.HS512, secret)
                .setClaims(userInfo)
                .compact();
        return aes256TextEncryptor.encrypt(compact);
    }
    /**
     * 获取token中注册信息
     * @param token
     * @return
     */
    public Claims getTokenClaim (String token) {
        try {
            String decrypt = aes256TextEncryptor.decrypt(token);
            return Jwts.parser().setSigningKey(secret).parseClaimsJws(decrypt).getBody();
        }catch (Exception e){
//            e.printStackTrace();
            return null;
        }
    }
    /**
     * 验证token是否过期失效
     * @param expirationTime
     * @return
     */
    public boolean isTokenExpired (Date expirationTime) {
        return expirationTime.before(new Date());
    }

    /**
     * 获取token失效时间
     * @param token
     * @return
     */
    public Date getExpirationDateFromToken(String token) {
        return getTokenClaim(token).getExpiration();
    }
    /**
     * 获取用户名从token中
     */
    public String getUsernameFromToken(String token) {
        return getTokenClaim(token).getSubject();
    }

    /**
     * 获取jwt发布时间
     */
    public Date getIssuedAtDateFromToken(String token) {
        return getTokenClaim(token).getIssuedAt();
    }



}
