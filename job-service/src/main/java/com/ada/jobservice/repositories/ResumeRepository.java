package com.ada.jobservice.repositories;

import com.ada.jobservice.entities.FormationEntity;
import com.ada.jobservice.entities.ResumeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResumeRepository extends MongoRepository<ResumeEntity, String> {
}
