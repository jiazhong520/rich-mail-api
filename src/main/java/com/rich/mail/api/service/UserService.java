package com.rich.mail.api.service;

import com.rich.mail.api.domain.CustomUserEntity;
import com.rich.mail.api.param.LoginParm;
import com.rich.mail.api.param.RegisteredCode;
import com.rich.mail.api.param.RegisteredParam;
import com.rich.mail.api.param.SendParam;

public interface UserService {

    /**
     * 登录
     *
     * @param loginParm
     * @return
     */
    Object login(LoginParm loginParm);

    /**
     * 注册
     *
     * @param registeredParam
     * @return
     */
    Object registered(RegisteredParam registeredParam);


    /**
     * 用户信息
     *
     * @param customUserEntity
     * @return
     */
    Object userInfo(CustomUserEntity customUserEntity);


    /**
     * 检测用户
     *
     * @param code
     * @return
     */
    Object checkCode(String code);


    /**
     * 验证注册短信码
     *
     * @param registeredCode
     * @return
     */
    Object checkRegisteredCode(RegisteredCode registeredCode);


    /**
     * 发送验证码
     * @param sendParam
     * @return
     */
    Object sendCode(SendParam sendParam);
}
