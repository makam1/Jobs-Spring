package com.ada.jobservice.services.ExperienceService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import com.ada.jobservice.dto.ExperienceDTO;
import com.ada.jobservice.entities.ExperienceEntity;
import com.ada.jobservice.mappers.ExperienceMapper;
import com.ada.jobservice.repositories.ExperienceRepository;

public class ExperienceServiceImpl implements ExperienceService {
	
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
	public ExperienceEntity getExperienceById(Long id) {
		return experienceRepository.findById(id).get();
	}

	@Override
	public ExperienceDTO createExperience(ExperienceDTO experienceDTO) {
		ExperienceEntity experienceEntity = experienceMapper.toEntity(experienceDTO);
	    // Sauvegarde du restaurant entité au niveau de la BDD
		ExperienceEntity experienceEntityCreated = experienceRepository.save(experienceEntity);
	    // Conversion automatique de entité en dto
	    ExperienceDTO experienceDTO1 = experienceMapper.toDto(experienceEntityCreated);
	    // On retourne de dto crée
	    return experienceDTO1;

	}

	@Override
	public ExperienceEntity updateExperience(Long id, ExperienceEntity experienceRequest) {
		Optional<ExperienceEntity> experienceExist = experienceRepository.findById(id);

        if (!experienceExist.isPresent()) {
            return null;
        }

        ExperienceEntity experienceEntity = experienceExist.get();

        experienceEntity.setStartDate(experienceRequest.getStartDate());
        experienceEntity.setEndDate(experienceRequest.getEndDate());
        experienceEntity.setFunction(experienceRequest.getFunction());
        experienceEntity.setCompanyName(experienceRequest.getCompanyName());
        experienceEntity.setRealisation(experienceRequest.getRealisation());

        experienceRepository.save(experienceEntity);
        return experienceEntity;
	}

	@Override
	public void deleteExperience(Long id) {
		experienceRepository.deleteById(id);

	}

}
