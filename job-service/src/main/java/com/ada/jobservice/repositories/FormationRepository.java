package com.ada.jobservice.repositories;

import com.ada.jobservice.entities.ExperienceEntity;
import com.ada.jobservice.entities.FormationEntity;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FormationRepository extends MongoRepository<FormationEntity, String> {
    List<FormationEntity> findByUser(String user);

}
