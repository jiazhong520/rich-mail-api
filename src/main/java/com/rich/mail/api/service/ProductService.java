package com.rich.mail.api.service;

import com.rich.mail.api.domain.CustomUserEntity;

public interface ProductService {

    Object productDetail(CustomUserEntity customUserEntity,Long productId);
}
