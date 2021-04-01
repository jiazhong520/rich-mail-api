package com.rich.mail.api.response;

import com.rich.mail.api.domain.TargetAddressEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@ApiModel("收货地址")
@Data
public class AddressInfo implements Serializable {
    @ApiModelProperty("地址id")
    private Long id;
    @ApiModelProperty("收货名")
    private String userName;
    @ApiModelProperty("收货手机号")
    private String userPhone;
    @ApiModelProperty("详细地址")
    private String address;
    @ApiModelProperty("省")
    private String province;
    @ApiModelProperty("市")
    private String city;
    @ApiModelProperty("区")
    private String area;
    @ApiModelProperty("是否是默认")
    private Boolean defaultStatus;

    public static AddressInfo toAddressInfo(TargetAddressEntity address) {
        AddressInfo addressInfo = new AddressInfo();
        addressInfo.setDefaultStatus(address.getDefaultStatus());
        addressInfo.setArea(address.getArea());
        addressInfo.setCity(address.getCity());
        addressInfo.setProvince(address.getProvince());
        addressInfo.setAddress(address.getAddress());
        addressInfo.setUserPhone(address.getUserPhone());
        addressInfo.setUserName(address.getUserName());
        addressInfo.setId(address.getId());
        return addressInfo;
    }

    public static TargetAddressEntity toTargetAddressEntity(AddressInfo address) {
        TargetAddressEntity targetAddressEntity = new TargetAddressEntity();

        if (Objects.nonNull(address.getDefaultStatus())) {
            targetAddressEntity.setDefaultStatus(address.getDefaultStatus());
        }
        targetAddressEntity.setArea(address.getArea());
        targetAddressEntity.setCity(address.getCity());
        targetAddressEntity.setProvince(address.getProvince());
        targetAddressEntity.setAddress(address.getAddress());
        targetAddressEntity.setUserPhone(address.getUserPhone());
        targetAddressEntity.setUserName(address.getUserName());
        targetAddressEntity.setDeleteFlag(false);
        targetAddressEntity.setCreateDate(new Date());
        targetAddressEntity.setLastUpdateBy("admin");
        targetAddressEntity.setLastUpdateDate(new Date());
        targetAddressEntity.setCreateBy("admin");
        return targetAddressEntity;
    }

    public static TargetAddressEntity toTargetAddressEntity(AddressInfo address, TargetAddressEntity targetAddressEntity) {
        if (Objects.nonNull(address.getDefaultStatus())) {
            targetAddressEntity.setDefaultStatus(address.getDefaultStatus());
        }
        if (StringUtils.isNotEmpty(address.getArea())) {
            targetAddressEntity.setArea(address.getArea());
        }
        if (StringUtils.isNotEmpty(address.getCity())) {
            targetAddressEntity.setCity(address.getCity());
        }
        if (StringUtils.isNotEmpty(address.getProvince())) {
            targetAddressEntity.setProvince(address.getProvince());
        }
        if (StringUtils.isNotEmpty(address.getAddress())) {
            targetAddressEntity.setAddress(address.getAddress());
        }
        if (StringUtils.isNotEmpty(address.getUserPhone())) {
            targetAddressEntity.setUserPhone(address.getUserPhone());
        }
        if (StringUtils.isNotEmpty(address.getUserName())) {
            targetAddressEntity.setUserName(address.getUserName());
        }
        targetAddressEntity.setLastUpdateBy("admin");
        targetAddressEntity.setLastUpdateDate(new Date());
        return targetAddressEntity;
    }
}
