package com.rich.mail.api.controller;

import com.rich.mail.api.code.CodeUtils;
import com.rich.mail.api.domain.CustomUserEntity;
import com.rich.mail.api.param.LoginParm;
import com.rich.mail.api.param.RegisteredCode;
import com.rich.mail.api.param.RegisteredParam;
import com.rich.mail.api.param.SendParam;
import com.rich.mail.api.response.UserInfo;
import com.rich.mail.api.service.UserService;
import com.rich.mail.api.utils.Contract;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@Api(value = "用户操作", tags = "用户操作")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    @ApiOperation(value = "登录接口", response = CodeUtils.class)
    public Object login(@RequestBody LoginParm loginParm) {
        return userService.login(loginParm);
    }

    @PostMapping("/userInfo")
    @ApiOperation(value = "用户信息", response = UserInfo.class)
    public Object userInfo(@ApiIgnore @RequestAttribute(value = Contract.user, required = true) CustomUserEntity customUserEntity) {
        return userService.userInfo(customUserEntity);
    }

    @PostMapping("/checkCode/{code}")
    @ApiOperation(value = "注册检测推荐code 是否正确", response = CodeUtils.class)
    public Object checkCode(@PathVariable("code") String code) {
        return userService.checkCode(code);
    }


    @PostMapping("/registered")
    @ApiOperation(value = "注册", response = CodeUtils.class)
    public Object registered(@RequestBody RegisteredParam registeredParam) {
        return userService.registered(registeredParam);
    }

    @PostMapping("/checkRegisteredCode")
    @ApiOperation(value = "检测注册短信验证码", response = CodeUtils.class)
    public Object checkRegisteredCode(@RequestBody  RegisteredCode registeredCode) {
        return userService.checkRegisteredCode(registeredCode);
    }

    @PostMapping("/sendCode")
    @ApiOperation(value = "发送验证码", response = CodeUtils.class)
    public Object checkRegisteredCode(@RequestBody  SendParam sendParam) {
        return userService.sendCode(sendParam);
    }
}
