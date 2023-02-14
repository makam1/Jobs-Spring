package com.ada.jobservice.repositories;

import com.ada.jobservice.entities.FormationEntity;
import com.ada.jobservice.entities.LangageEntity;
import com.ada.jobservice.entities.SkillsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SkillRepository extends MongoRepository<SkillsEntity, String> {
    List<SkillsEntity> findByUser(String user);

}
