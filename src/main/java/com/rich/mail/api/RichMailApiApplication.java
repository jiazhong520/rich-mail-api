package com.rich.mail.api;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableKnife4j
@EnableSwagger2
public class RichMailApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RichMailApiApplication.class, args);
    }

}
