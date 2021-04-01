package com.rich.mail.api.repository;

import com.rich.mail.api.domain.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    @Query(value = "select * from product where delete_flag=0", nativeQuery = true)
    List<ProductEntity> queryProducts();
}
