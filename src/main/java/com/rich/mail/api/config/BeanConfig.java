package com.rich.mail.api.config;

import org.jasypt.util.text.AES256TextEncryptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public AES256TextEncryptor aes256TextEncryptor(){
        return new AES256TextEncryptor();
    }
}
