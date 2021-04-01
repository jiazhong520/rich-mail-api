package com.rich.mail.api.service;

import com.rich.mail.api.domain.CustomUserEntity;

public interface HomeService {

    /**
     * 获取首页轮播图
     * @param customUserEntity
     * @return
     */
    Object banners(CustomUserEntity customUserEntity);


    /**
     * 获取轮播消息
     * @param customUserEntity
     * @return
     */
    Object messages(CustomUserEntity customUserEntity);


    /**
     * 获取首页商品
     * @param customUserEntity
     * @return
     */
    Object products(CustomUserEntity customUserEntity);

}
