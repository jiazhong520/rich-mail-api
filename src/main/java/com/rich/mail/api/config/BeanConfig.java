package com.rich.mail.api.config;

import lombok.Data;
import org.jasypt.util.text.AES256TextEncryptor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties(prefix = "config.jwt")
@Data
public class BeanConfig {

    private String secret;

    @Bean
    public AES256TextEncryptor aes256TextEncryptor() {
        AES256TextEncryptor aes256TextEncryptor = new AES256TextEncryptor();
        aes256TextEncryptor.setPassword(secret);
        return aes256TextEncryptor;
    }
}
