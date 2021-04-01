package com.rich.mail.api.service;

public interface SmsService {
    public String sendCode(Integer type,String phone);
}
