package com.rich.mail.api.controller;

import com.rich.mail.api.domain.CustomUserEntity;
import com.rich.mail.api.service.HomeService;
import com.rich.mail.api.utils.Contract;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

@Api("首页")
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/banners")
    @ApiOperation("获取轮播图")
    public Object banners(@RequestAttribute(value = Contract.user, required = false) CustomUserEntity customUserEntity) {
        return homeService.banners(customUserEntity);
    }

    @GetMapping("/messages")
    @ApiOperation("获取轮询消息")
    public Object messages(@RequestAttribute(value = Contract.user, required = false) CustomUserEntity customUserEntity) {
        return homeService.messages(customUserEntity);
    }

    @GetMapping("/products")
    @ApiOperation("获取首页商品")
    public Object products(@RequestAttribute(value = Contract.user, required = false) CustomUserEntity customUserEntity) {
        return homeService.products(customUserEntity);
    }
}
