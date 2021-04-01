package com.rich.mail.api.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@ApiModel("商品结合")
@Data
public class ProductInfos {
    @ApiModelProperty("热销商品")
    private List<ProductInfo> heatProducts;

    @ApiModelProperty("金币商品")
    private List<ProductInfo> goldProducts;

    @ApiModelProperty("积分商品")
    private List<ProductInfo> integralProducts;
}
