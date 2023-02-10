package com.ada.jobservice.services.FormationService;

import com.ada.jobservice.dto.FormationDTO;
import com.ada.jobservice.entities.FormationEntity;

import java.util.List;

public interface Formationservice {

    public List<FormationEntity> getFormations();

    public FormationEntity getFormationById(String id);

    public FormationDTO createFormation(FormationDTO formationDTO);

    public FormationEntity updateFormation(String id, FormationEntity formationRequest);

    public void deleteFormation(String id);
}
