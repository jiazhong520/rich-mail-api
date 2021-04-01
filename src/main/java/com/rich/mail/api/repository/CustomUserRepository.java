package com.rich.mail.api.repository;

import com.rich.mail.api.domain.CustomUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomUserRepository extends JpaRepository<CustomUserEntity, Long> {

    @Query(value = "select * from custom_user where delete_flag=0 id=?1 ", nativeQuery = true)
    CustomUserEntity getCustomUserEntitiesById(Long id);


    @Query(value = "select * from  custom_user where delete_flag=0 and phone=?1 and parent_id is NULL ", nativeQuery = true)
    CustomUserEntity findCustomByPhone(String phone);


    @Query(value = "select * from  custom_user where delete_flag=0 and code=?1", nativeQuery = true)
    CustomUserEntity findCustomUserByCode(String code);


    @Query(value = "select count(1) from  custom_user where delete_flag=0 and user_name=?1", nativeQuery = true)
    int findCustomUserByUserName(String userName);
}
