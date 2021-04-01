package com.rich.mail.api.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("注册验证")
@Data
public class RegisteredCode {
    @ApiModelProperty("短信码")
    private String code;
    @ApiModelProperty("手机号")
    private String phone;
}
