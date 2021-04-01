package com.rich.mail.api.response;

import com.rich.mail.api.domain.ProductEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel("商品")
public class ProductInfo implements Serializable {
    @ApiModelProperty("商品名称")
    private String productName;

    @ApiModelProperty("商品标题")
    private String productTile;

    @ApiModelProperty("商品图片")
    private String productImage;

    @ApiModelProperty("商品类型")
    private Integer productType;

    @ApiModelProperty("商品id")
    private Long id;

    @ApiModelProperty("商品价格")
    private String price;

    public static ProductInfo toProductInfo(ProductEntity product){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setId(product.getId());
        productInfo.setProductName(product.getProductName());
        productInfo.setProductTile(product.getProductTitle());
        productInfo.setProductImage(product.getProductImage());
        productInfo.setPrice(product.getPrice().toPlainString());
        productInfo.setProductType(product.getPriceType());
        return productInfo;
    }
}
