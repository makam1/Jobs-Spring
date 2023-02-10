package com.ada.jobservice.mappers;

import com.ada.jobservice.dto.ExperienceDTO;
import com.ada.jobservice.entities.ExperienceEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExperienceMapper {
    ExperienceEntity toEntity(ExperienceDTO experienceDTO);
    ExperienceDTO toDto(ExperienceEntity experienceEntity);
}
