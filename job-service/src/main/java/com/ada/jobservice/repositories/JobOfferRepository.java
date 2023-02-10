package com.ada.jobservice.repositories;

import com.ada.jobservice.entities.FormationEntity;
import com.ada.jobservice.entities.JobOfferEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobOfferRepository extends MongoRepository<JobOfferEntity, String> {
}
