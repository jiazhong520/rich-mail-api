package com.rich.mail.api.param;

import com.rich.mail.api.domain.CustomUserEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@ApiModel("注册请求参数")
@Data
public class RegisteredParam implements Serializable {
    @ApiModelProperty("手机号")
    private String phone;
    @ApiModelProperty("用户名")
    private String userName;
    @ApiModelProperty("注册码")
    private String code;
    @ApiModelProperty("密码")
    private String password;
    @ApiModelProperty("支付密码")
    private String payPassword;
    @ApiModelProperty("确认支付密码")
    private String confirmPayPassword;
    @ApiModelProperty("验证码")
    private String phoneCode;

    public CustomUserEntity setCustomUserEntity(Long parentId, String code) {
        CustomUserEntity user = new CustomUserEntity();
        user.setDeleteFlag(0);
        user.setCreateBy("admin");
        user.setCreateDate(new Date());
        user.setLastUpdateBy("admin");
        user.setLastUpdateDate(new Date());
        user.setUserPass(password);
        user.setPayPass(payPassword);
        user.setParentId(parentId);
        user.setUserName(userName);
        user.setbInfo("世界那么大，我想去看看");
        user.setIconLink("https://dss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=3717120934,3932520698&fm=26&gp=0.jpg");
        user.setCode(code);
        return user;
    }

}
