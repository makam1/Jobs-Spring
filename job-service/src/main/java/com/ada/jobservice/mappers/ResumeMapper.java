package com.ada.jobservice.mappers;

import com.ada.jobservice.dto.ResumeDTO;
import com.ada.jobservice.entities.ResumeEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ResumeMapper {
    ResumeEntity toEntity(ResumeDTO resumeDTO);
    ResumeDTO toDto(ResumeEntity resumeDTO);
}
