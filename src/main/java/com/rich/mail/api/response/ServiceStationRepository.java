package com.rich.mail.api.response;

import com.rich.mail.api.domain.ServiceAddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ServiceStationRepository extends JpaRepository<ServiceAddressEntity,Long> {

    @Query(value = "select * from service_address where delete_flag = 0 ",nativeQuery = true)
    List<ServiceAddressEntity> queryAllStation();
}
