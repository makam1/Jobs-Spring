package com.ada.jobservice.services.FormationService;

import com.ada.jobservice.dto.FormationDTO;
import com.ada.jobservice.entities.FormationEntity;

import java.util.List;

public interface Formationservice {
    FormationDTO addFormation(FormationDTO formation);

    FormationEntity editFormation(FormationEntity formation);

    List<FormationEntity> formations();

    FormationEntity getFormation(Long id);

    void deleteFormation(Long id);
}
