package com.ada.jobservice.mappers;

import com.ada.jobservice.dto.CertificationDTO;
import com.ada.jobservice.entities.CertificationEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CertificationMapper {
    CertificationEntity toEntity(CertificationDTO certificationDTO);
    CertificationDTO toDto(CertificationEntity certificationEntity);

}
