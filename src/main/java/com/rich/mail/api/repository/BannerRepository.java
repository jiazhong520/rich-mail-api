package com.rich.mail.api.repository;

import com.rich.mail.api.domain.ActivityChartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BannerRepository extends JpaRepository<ActivityChartEntity,Long> {

    @Query(value = "select * from activity_chart where delete_flag = 1 and status = 1",nativeQuery = true)
    List<ActivityChartEntity>  queryActivityOpen();
}
