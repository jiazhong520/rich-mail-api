package com.rich.mail.api.repository;

import com.rich.mail.api.domain.EmitiratiEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MessageRepository extends JpaRepository<EmitiratiEntity, Long> {

    @Query(value = "select * from emitirati where delete_flag = 0 ", nativeQuery = true)
    List<EmitiratiEntity> queryMessages();

}
