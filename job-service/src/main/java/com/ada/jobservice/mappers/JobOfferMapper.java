package com.ada.jobservice.mappers;

import com.ada.jobservice.dto.HobbyDTO;
import com.ada.jobservice.dto.JobOfferDTO;
import com.ada.jobservice.entities.HobbiesEntity;
import com.ada.jobservice.entities.JobOfferEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface JobOfferMapper {
    JobOfferEntity toEntity(JobOfferDTO jobOfferDTO);
    JobOfferDTO toDto(JobOfferEntity jobOfferDTO);
}
