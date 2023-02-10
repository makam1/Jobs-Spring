package com.ada.jobservice.services.ExperienceService;

import com.ada.jobservice.dto.ExperienceDTO;
import com.ada.jobservice.entities.ExperienceEntity;

import java.util.List;

public interface ExperienceService {
    public List<ExperienceEntity> getExperiences();

    public ExperienceEntity getExperienceById(String id);

    public ExperienceDTO createExperience(ExperienceDTO experienceDTO);

    public ExperienceEntity updateExperience(String id, ExperienceEntity experienceRequest);

    public void deleteExperience(String id);
}
