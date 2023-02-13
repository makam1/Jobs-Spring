package com.ada.jobservice.mappers;

import com.ada.jobservice.dto.LangageDTO;
import com.ada.jobservice.entities.LangageEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LangageMapper {
    LangageEntity toEntity(LangageDTO langageDTO);
    LangageDTO toDto(LangageEntity langageDTO);
}
