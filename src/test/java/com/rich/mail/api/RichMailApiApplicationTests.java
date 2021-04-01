package com.rich.mail.api;

import com.rich.mail.api.utils.RedisKey;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest(classes = RichMailApiApplication.class)
class RichMailApiApplicationTests {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Test
    void contextLoads() {
        redisTemplate.opsForValue().set(RedisKey.USER_LOGIN_CODE+"18311036540","6666");
    }

}
