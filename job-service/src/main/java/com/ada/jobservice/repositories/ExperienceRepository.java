package com.ada.jobservice.repositories;

import com.ada.jobservice.entities.ExperienceEntity;
import com.ada.jobservice.entities.FormationEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExperienceRepository extends MongoRepository<ExperienceEntity, String> {
}
