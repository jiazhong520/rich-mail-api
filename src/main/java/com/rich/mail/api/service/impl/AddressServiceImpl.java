package com.rich.mail.api.service.impl;

import com.rich.mail.api.code.CodeUtils;
import com.rich.mail.api.domain.CustomUserEntity;
import com.rich.mail.api.domain.TargetAddressEntity;
import com.rich.mail.api.repository.UserAddressRepository;
import com.rich.mail.api.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private UserAddressRepository userAddressRepository;

    @Override
    public Object userAddressInfos(CustomUserEntity customUserEntity) {
        List<TargetAddressEntity> address = userAddressRepository.queryUserAllAddress(customUserEntity.getId());
        if (CollectionUtils.isEmpty(address)) {
            return CodeUtils.EXIST();
        }

        return null;
    }
}
