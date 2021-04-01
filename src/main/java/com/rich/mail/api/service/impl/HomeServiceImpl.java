package com.rich.mail.api.service.impl;

import com.rich.mail.api.code.CodeUtils;
import com.rich.mail.api.code.Codes;
import com.rich.mail.api.domain.ActivityChartEntity;
import com.rich.mail.api.domain.CustomUserEntity;
import com.rich.mail.api.domain.EmitiratiEntity;
import com.rich.mail.api.domain.ProductEntity;
import com.rich.mail.api.repository.BannerRepository;
import com.rich.mail.api.repository.MessageRepository;
import com.rich.mail.api.repository.ProductRepository;
import com.rich.mail.api.response.BannerInfo;
import com.rich.mail.api.response.ProductInfo;
import com.rich.mail.api.response.ProductInfos;
import com.rich.mail.api.service.HomeService;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    private BannerRepository bannerRepository;

    @Autowired
    private MessageRepository messageRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Object banners(CustomUserEntity customUserEntity) {
        List<ActivityChartEntity> banners = bannerRepository.queryActivityOpen();
        if (CollectionUtils.isEmpty(banners)) {
            return CodeUtils.EXIST();
        }
        List<BannerInfo> bannerInfos = banners.stream().map(BannerInfo::toBannerInfo).collect(Collectors.toList());
        return CodeUtils.SUCCESS(bannerInfos);
    }


    @Override
    public Object messages(CustomUserEntity customUserEntity) {
        List<EmitiratiEntity> emitiratiEntities = messageRepository.queryMessages();
        if (CollectionUtils.isEmpty(emitiratiEntities)) {
            return CodeUtils.EXIST();
        }
        List<String> messages = emitiratiEntities.stream().map(EmitiratiEntity::getMessage).collect(Collectors.toList());
        return CodeUtils.SUCCESS(messages);
    }

    @Override
    public Object products(CustomUserEntity customUserEntity) {
        List<ProductEntity> productEntities = productRepository.queryProducts();
        if (CollectionUtils.isEmpty(productEntities)) {
            return CodeUtils.EXIST();
        }

        List<ProductInfo> heatProducts = new ArrayList<>();
        List<ProductInfo> goldProducts = new ArrayList<>();
        List<ProductInfo> integralProducts = new ArrayList<>();
        for (ProductEntity productEntity : productEntities) {
            ProductInfo productInfo = ProductInfo.toProductInfo(productEntity);
            if (productEntity.getStatus() == 1) {
                heatProducts.add(productInfo);
            }
            if (productEntity.getPriceType() == 1) {
                goldProducts.add(productInfo);
            } else if (productEntity.getPriceType() == 1) {
                integralProducts.add(productInfo);
            }
        }
        ProductInfos productInfos = new ProductInfos();
        productInfos.setHeatProducts(heatProducts);
        productInfos.setGoldProducts(goldProducts);
        productInfos.setIntegralProducts(integralProducts);
        return CodeUtils.SUCCESS(productInfos);
    }


}
