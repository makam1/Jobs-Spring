package com.ada.jobservice.repositories;

import com.ada.jobservice.entities.FormationEntity;
import com.ada.jobservice.entities.HobbiesEntity;
import com.ada.jobservice.entities.LangageEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LangageRepository extends MongoRepository<LangageEntity, String> {
    List<LangageEntity> findByUser(String user);

}
