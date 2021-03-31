package com.rich.mail.api.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel("登录请求参数")
@Data
public class LoginParm implements Serializable {

    @ApiModelProperty("登录手机号")
    private String phone;

    @ApiModelProperty("登录密码或验证码")
    private String password;

    @ApiModelProperty("登录类型 1 密码登录  2 验证码登录")
    private Integer type;
}
