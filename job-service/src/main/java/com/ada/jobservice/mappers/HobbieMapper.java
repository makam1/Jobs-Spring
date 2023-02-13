package com.ada.jobservice.mappers;

import com.ada.jobservice.dto.HobbyDTO;
import com.ada.jobservice.entities.HobbiesEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface HobbieMapper {
    HobbiesEntity toEntity(HobbyDTO hobbieDTO);
    HobbyDTO toDto(HobbiesEntity hobbieEntity);
}
