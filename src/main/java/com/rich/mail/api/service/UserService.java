package com.rich.mail.api.service;

import com.rich.mail.api.domain.CustomUserEntity;
import com.rich.mail.api.param.LoginParm;
import com.rich.mail.api.param.RegisteredParam;

public interface UserService {

    /**
     * 登录
     * @param loginParm
     * @return
     */
    Object login(LoginParm loginParm);

    /**
     * 注册
     * @param registeredParam
     * @return
     */
    Object registered(RegisteredParam registeredParam);


    /**
     * 用户信息
     * @param customUserEntity
     * @return
     */
    Object userInfo(CustomUserEntity customUserEntity);
}
