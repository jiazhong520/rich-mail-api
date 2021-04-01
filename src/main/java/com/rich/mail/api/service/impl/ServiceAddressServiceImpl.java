package com.rich.mail.api.service.impl;

import com.rich.mail.api.code.CodeUtils;
import com.rich.mail.api.domain.CustomUserEntity;
import com.rich.mail.api.domain.ServiceAddressEntity;
import com.rich.mail.api.repository.ServiceStationInfo;
import com.rich.mail.api.response.ServiceStationRepository;
import com.rich.mail.api.service.ServiceAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceAddressServiceImpl implements ServiceAddressService {

    @Autowired
    private ServiceStationRepository serviceStationRepository;

    @Override
    public Object serviceInfos(CustomUserEntity customUserEntity) {
        List<ServiceAddressEntity> serviceStations = serviceStationRepository.queryAllStation();
        if (CollectionUtils.isEmpty(serviceStations)) {
            return CodeUtils.EXIST();
        }
        List<ServiceStationInfo> serviceStationInfos = serviceStations.stream().map(ServiceStationInfo::toServiceStationInfo).collect(Collectors.toList());
        return CodeUtils.SUCCESS(serviceStationInfos);
    }
}
