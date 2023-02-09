package com.ada.jobservice.repositories;

import com.ada.jobservice.entities.CompanyEntity;
import com.ada.jobservice.entities.FormationEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompanyRepository extends MongoRepository<CompanyEntity, String> {
}
