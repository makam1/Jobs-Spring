package com.ada.jobservice.repositories;

import com.ada.jobservice.entities.CertificationEntity;
import com.ada.jobservice.entities.FormationEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CertificationRepository extends MongoRepository<CertificationEntity, Long> {
}
