package com.rich.mail.api.controller;

import com.rich.mail.api.domain.CustomUserEntity;
import com.rich.mail.api.response.AddressInfo;
import com.rich.mail.api.service.AddressService;
import com.rich.mail.api.utils.Contract;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api("用户收货地址")
@RestController
public class UserAddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/userAddressInfos")
    @ApiOperation(value = "获取用户收货地址", response = AddressInfo.class)
    public Object userAddressInfos(@RequestAttribute(Contract.user) CustomUserEntity customUserEntity) {
        return addressService.userAddressInfos(customUserEntity);
    }

    @PostMapping("/addUserAddress")
    @ApiOperation(value = "添加用户收货地址", response = AddressInfo.class)
    public Object addUserAddress(@RequestAttribute(Contract.user) CustomUserEntity customUserEntity,
                                 @RequestBody AddressInfo addressInfo
    ) {
        return addressService.addUserAddress(customUserEntity, addressInfo);
    }


    @GetMapping("/updateDefault")
    @ApiOperation(value = "更新收获地址信息", response = AddressInfo.class)
    public Object updateDefault(@RequestAttribute(Contract.user) CustomUserEntity customUserEntity,
                                @RequestBody AddressInfo addressInfo) {
        return addressService.updateDefault(customUserEntity, addressInfo);
    }


    @DeleteMapping("/removeAddress/{id}")
    @ApiOperation(value = "删除用户收获地址", response = AddressInfo.class)
    public Object removeAddress(@RequestAttribute(Contract.user) CustomUserEntity customUserEntity,
                                @PathVariable Long id) {
        return addressService.removeAddress(customUserEntity, id);
    }

}
