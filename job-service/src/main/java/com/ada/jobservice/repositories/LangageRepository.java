package com.ada.jobservice.repositories;

import com.ada.jobservice.entities.FormationEntity;
import com.ada.jobservice.entities.LangageEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LangageRepository extends MongoRepository<LangageEntity, String> {
}
