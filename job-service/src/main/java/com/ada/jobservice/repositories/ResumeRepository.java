package com.ada.jobservice.repositories;

import com.ada.jobservice.entities.FormationEntity;
import com.ada.jobservice.entities.ResumeEntity;
import com.ada.jobservice.entities.SkillsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ResumeRepository extends MongoRepository<ResumeEntity, String> {
    List<ResumeEntity> findByUser(String user);
}
