package com.rich.mail.api.controller;

import com.rich.mail.api.domain.CustomUserEntity;
import com.rich.mail.api.repository.ServiceStationInfo;
import com.rich.mail.api.service.ServiceAddressService;
import com.rich.mail.api.utils.Contract;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RestController;

@Api("服务站点")
@RestController
public class ServiceStationController {

    @Autowired
    private ServiceAddressService serviceAddressService;


    @GetMapping("/serviceInfos")
    @ApiOperation(value = "服务站点接口", response = ServiceStationInfo.class)
    public Object serviceInfos(@RequestAttribute(value = Contract.user, required = false) CustomUserEntity customUserEntity) {
        return serviceAddressService.serviceInfos(customUserEntity);
    }

}
