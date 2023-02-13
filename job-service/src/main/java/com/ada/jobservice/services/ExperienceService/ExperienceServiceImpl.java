package com.ada.jobservice.services.ExperienceService;

import com.ada.jobservice.dto.ExperienceDTO;
import com.ada.jobservice.entities.ExperienceEntity;
import com.ada.jobservice.mappers.ExperienceMapper;
import com.ada.jobservice.repositories.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExperienceServiceImpl implements ExperienceService{
    private final ExperienceRepository experienceRepository;

    private final ExperienceMapper experienceMapper;

    private final ExperienceService experienceService;

    @Autowired
    public ExperienceServiceImpl(@Lazy ExperienceService experienceService, @Lazy ExperienceRepository experienceRepository, @Lazy ExperienceMapper experienceMapper) {
        this.experienceRepository = experienceRepository;
        this.experienceMapper = experienceMapper;
        this.experienceService = experienceService;
    }
    @Override
    public List<ExperienceEntity> getExperiences() {
        return experienceRepository.findAll();
    }
    @Override
    public ExperienceEntity getExperienceById(String id) {
        Optional<ExperienceEntity> optionalExperience = experienceRepository.findById(id);
        return optionalExperience.get();
    }
    @Override
    public ExperienceDTO createExperience(ExperienceDTO experienceDTO) {
        ExperienceEntity experienceEntity = experienceMapper.toEntity(experienceDTO);
        ExperienceEntity experienceEntityCreated = experienceRepository.save(experienceEntity);
        ExperienceDTO experienceDTO1 = experienceMapper.toDto(experienceEntityCreated);
        return experienceDTO1;
    }

    @Override
    public ExperienceEntity updateExperience(String id, ExperienceEntity experienceRequest) {
        Optional<ExperienceEntity> experienceExist = experienceRepository.findById(id);

        if (!experienceExist.isPresent()) {
            return null;
        }

        ExperienceEntity experienceEntity = experienceExist.get();

        experienceEntity.setCompanyName(experienceRequest.getCompanyName());
        experienceEntity.setFunction(experienceRequest.getFunction());
        experienceEntity.setRealisation(experienceRequest.getRealisation());
        experienceEntity.setStartDate(experienceRequest.getStartDate());
        experienceEntity.setEndDate(experienceRequest.getEndDate());

        experienceRepository.save(experienceEntity);
        return experienceEntity;
    }

    @Override
    public void deleteExperience(String id) {
        experienceRepository.deleteById(id);
    }
}
