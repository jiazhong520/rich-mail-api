package com.rich.mail.api.response;

import com.rich.mail.api.domain.ActivityChartEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel("轮播图")
@Data
public class BannerInfo implements Serializable {

    @ApiModelProperty("图片地址")
    private String image;

    @ApiModelProperty("跳转地址")
    private String link;

    public static BannerInfo toBannerInfo(ActivityChartEntity activityChartEntity) {
        BannerInfo bannerInfo = new BannerInfo();
        bannerInfo.setImage(activityChartEntity.getImageUrl());
        bannerInfo.setLink(activityChartEntity.getImageLick());
        return bannerInfo;
    }

}
