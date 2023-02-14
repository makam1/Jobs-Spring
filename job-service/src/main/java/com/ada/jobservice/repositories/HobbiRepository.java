package com.ada.jobservice.repositories;

import com.ada.jobservice.entities.FormationEntity;
import com.ada.jobservice.entities.HobbiesEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface HobbiRepository extends MongoRepository<HobbiesEntity, String> {
    List<HobbiesEntity> findByUser(String user);

}
