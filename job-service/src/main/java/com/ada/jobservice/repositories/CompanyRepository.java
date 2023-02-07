package com.ada.jobservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ada.jobservice.entities.CompanyEntity;

public interface CompanyRepository extends MongoRepository<CompanyEntity, String> {

}
