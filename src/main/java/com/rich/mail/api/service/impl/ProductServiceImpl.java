package com.rich.mail.api.service.impl;

import com.rich.mail.api.domain.CustomUserEntity;
import com.rich.mail.api.repository.ProductRepository;
import com.rich.mail.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Object productDetail(CustomUserEntity customUserEntity, Long productId) {
        return null;
    }
}
