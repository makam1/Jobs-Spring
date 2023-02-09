package com.ada.jobservice.services.FormationService;

import com.ada.jobservice.dto.FormationDTO;
import com.ada.jobservice.entities.FormationEntity;
import com.ada.jobservice.mappers.FormationMapper;
import com.ada.jobservice.repositories.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormationServiceImpl implements Formationservice {

    private final FormationRepository formationRepository;

    private final FormationMapper formationMapper;

    private final Formationservice formationService;

    @Autowired
    public FormationServiceImpl(@Lazy Formationservice formationService, @Lazy FormationRepository formationRepository, @Lazy FormationMapper formationMapper) {
        this.formationRepository = formationRepository;
        this.formationMapper = formationMapper;
        this.formationService = formationService;
    }
    @Override
    public List<FormationEntity> getFormations() {
        return formationRepository.findAll();
    }
    @Override
    public FormationEntity getFormationById(String id) {
        Optional<FormationEntity> optionalFormation = formationRepository.findById(id);
        return optionalFormation.get();
    }
    @Override
    public FormationDTO createFormation(FormationDTO formationDTO) {
        FormationEntity formationEntity = formationMapper.toEntity(formationDTO);
        // Sauvegarde du restaurant entité au niveau de la BDD
        FormationEntity formationEntityCreated = formationRepository.save(formationEntity);
        // Conversion automatique de entité en dto
        FormationDTO formationDTO1 = formationMapper.toDto(formationEntityCreated);
        // On retourne de dto crée
        return formationDTO1;
    }

    @Override
    public FormationEntity updateFormation(String id, FormationEntity formationRequest) {
        Optional<FormationEntity> formationExist = formationRepository.findById(id);

        if (!formationExist.isPresent()) {
            return null;
        }

        FormationEntity formationEntity = formationExist.get();

        formationEntity.setName(formationRequest.getName());
        formationEntity.setDegree(formationRequest.getDegree());
        formationEntity.setSchoolName(formationRequest.getSchoolName());
        formationEntity.setSchoolCity(formationRequest.getSchoolCity());
        formationEntity.setStartDate(formationRequest.getStartDate());
        formationEntity.setEndDate(formationRequest.getEndDate());

        formationRepository.save(formationEntity);
        return formationEntity;
    }

    @Override
    public void deleteFormation(String id) {
        formationRepository.deleteById(id);
    }
}
