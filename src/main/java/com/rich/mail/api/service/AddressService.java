package com.rich.mail.api.service;

import com.rich.mail.api.domain.CustomUserEntity;
import com.rich.mail.api.response.AddressInfo;

public interface AddressService {


    /**
     * 获取用户所有收获地址
     * @param customUserEntity
     * @return
     */
    Object userAddressInfos(CustomUserEntity customUserEntity);


    /**
     * 添加收获地址
     * @param customUserEntity
     * @return
     */
    Object addUserAddress(CustomUserEntity customUserEntity, AddressInfo addressInfo);


    /**
     * 更新地址信息
     * @param customUserEntity
     * @return
     */
    Object updateDefault(CustomUserEntity customUserEntity, AddressInfo addressInfo);


    /**
     * 删除地址
     * @param customUserEntity
     * @return
     */
    Object removeAddress(CustomUserEntity customUserEntity,Long id);

}
