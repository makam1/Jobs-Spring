package com.ada.jobservice.mappers;

import com.ada.jobservice.dto.FormationDTO;
import com.ada.jobservice.entities.FormationEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FormationMapper {
    FormationEntity toEntity(FormationDTO formationDTO);
    FormationDTO toDto(FormationEntity formationEntity);
}
