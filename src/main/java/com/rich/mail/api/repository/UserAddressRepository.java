package com.rich.mail.api.repository;

import com.rich.mail.api.domain.TargetAddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserAddressRepository extends JpaRepository<TargetAddressEntity, Long> {

    @Query(value = "select  * from target_address where delete_flag =0 and user_id=?1", nativeQuery = true)
    List<TargetAddressEntity> queryUserAllAddress(Long userId);

}
