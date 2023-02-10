package com.ada.jobservice.repositories;

import com.ada.jobservice.entities.FormationEntity;
import com.ada.jobservice.entities.SkillsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SkillRepository extends MongoRepository<SkillsEntity, String> {
}
