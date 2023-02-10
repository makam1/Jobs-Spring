package com.ada.jobservice.mappers;

import com.ada.jobservice.dto.SkillsDTO;
import com.ada.jobservice.entities.SkillsEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SkillMapper {
    SkillsEntity toEntity(SkillsDTO skillDTO);
    SkillsDTO toDto(SkillsEntity skillDTO);
}
