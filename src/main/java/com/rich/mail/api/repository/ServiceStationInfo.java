package com.rich.mail.api.repository;

import com.rich.mail.api.domain.ServiceAddressEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel("服务站点")
@Data
public class ServiceStationInfo implements Serializable {

    @ApiModelProperty("站点id")
    private Long id;

    @ApiModelProperty("站点地址")
    private String serviceAddress;

    @ApiModelProperty("站点名称")
    private String serviceName;

    public static ServiceStationInfo toServiceStationInfo(ServiceAddressEntity serviceStation) {
        ServiceStationInfo serviceStationInfo = new ServiceStationInfo();
        serviceStationInfo.setId(serviceStation.getId());
        serviceStationInfo.setServiceAddress(serviceStation.getServiceAddress());
        serviceStationInfo.setServiceName(serviceStation.getServiceName());
        return serviceStationInfo;
    }

}
