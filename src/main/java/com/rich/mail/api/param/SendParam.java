package com.rich.mail.api.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel("发送验证码")
@Data
public class SendParam implements Serializable {

    @ApiModelProperty("手机号")
    private String phone;

    @ApiModelProperty("发送类型 1 登录 2 注册")
    private Integer type;
}
