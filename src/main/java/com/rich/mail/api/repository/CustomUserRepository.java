package com.rich.mail.api.repository;

import com.rich.mail.api.domain.CustomUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomUserRepository extends JpaRepository<CustomUserEntity, Long> {

    @Query(value = "select * from custom_user where delete_flag=0 id=?1", nativeQuery = true)
    CustomUserEntity getCustomUserEntitiesById(Long id);
}
