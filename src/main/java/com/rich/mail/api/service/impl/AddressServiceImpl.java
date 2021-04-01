package com.rich.mail.api.service.impl;

import com.rich.mail.api.code.CodeUtils;
import com.rich.mail.api.domain.CustomUserEntity;
import com.rich.mail.api.domain.TargetAddressEntity;
import com.rich.mail.api.repository.UserAddressRepository;
import com.rich.mail.api.response.AddressInfo;
import com.rich.mail.api.service.AddressService;
import org.aspectj.apache.bcel.classfile.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

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
        List<AddressInfo> collect = address.stream().map(AddressInfo::toAddressInfo).collect(Collectors.toList());
        return CodeUtils.SUCCESS(collect);
    }

    @Override
    public Object addUserAddress(CustomUserEntity customUserEntity, AddressInfo addressInfo) {
        TargetAddressEntity targetAddressEntity = AddressInfo.toTargetAddressEntity(addressInfo);
        if (targetAddressEntity.getDefaultStatus()) {
            List<TargetAddressEntity> address = userAddressRepository.queryUserAllAddress(customUserEntity.getId());
            address.stream().forEach(m -> {
                if (m.getDefaultStatus()) {
                    m.setDefaultStatus(false);
                    userAddressRepository.save(m);
                }
            });
        }
        userAddressRepository.save(targetAddressEntity);
        return CodeUtils.SUCCESS();
    }

    @Override
    public Object updateDefault(CustomUserEntity customUserEntity, AddressInfo addressInfo) {
        TargetAddressEntity addressEntity = userAddressRepository.queryByAddressId(addressInfo.getId());
        if (Objects.isNull(addressEntity)) {
            return CodeUtils.EXIST();
        }
        if (addressInfo.getDefaultStatus() && !addressEntity.getDefaultStatus()) {
            List<TargetAddressEntity> address = userAddressRepository.queryUserAllAddress(customUserEntity.getId());
            address.stream().forEach(m -> {
                if (m.getDefaultStatus()) {
                    m.setDefaultStatus(false);
                    userAddressRepository.save(m);
                }
            });
        }
        addressEntity = AddressInfo.toTargetAddressEntity(addressInfo, addressEntity);
        userAddressRepository.save(addressEntity);
        return CodeUtils.SUCCESS();
    }

    @Override
    public Object removeAddress(CustomUserEntity customUserEntity, Long id) {
        TargetAddressEntity addressEntity = userAddressRepository.queryByAddressId(id);
        if (Objects.isNull(addressEntity)) {
            return CodeUtils.EXIST();
        }
        addressEntity.setDeleteFlag(true);
        userAddressRepository.save(addressEntity);
        return CodeUtils.SUCCESS();
    }


}
