package com.rich.mail.api.response;

import com.rich.mail.api.domain.CustomUserEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel("用户信息")
@Data
public class UserInfo implements Serializable {
    @ApiModelProperty("用户名")
    private String userName;
    @ApiModelProperty("用户头像")
    private String userIcon;
    @ApiModelProperty("用户描述")
    private String desc;
    @ApiModelProperty("用户推荐码")
    private String code;

    public static UserInfo toUserInfo(CustomUserEntity user) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(user.getUserName());
        userInfo.setUserIcon(user.getIconLink());
        userInfo.setCode(user.getCode());
        userInfo.setDesc(user.getbInfo());
        return userInfo;
    }
}
