package com.rich.mail.api;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableKnife4j
public class RichMailApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RichMailApiApplication.class, args);
    }

}
