package com.ada.jobservice.services.ExperienceService;

import java.util.List;

import com.ada.jobservice.dto.ExperienceDTO;
import com.ada.jobservice.entities.ExperienceEntity;

public interface ExperienceService {

	public List<ExperienceEntity> getExperiences();

    public ExperienceEntity getExperienceById(Long id);

    public ExperienceDTO createExperience(ExperienceDTO experienceDTO);

    public ExperienceEntity updateExperience(Long id, ExperienceEntity experienceRequest);

    public void deleteExperience(Long id);
}
