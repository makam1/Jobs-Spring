package com.ada.jobservice.mappers;

import com.ada.jobservice.dto.CompanyDTO;
import com.ada.jobservice.entities.CompanyEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompanyMapper {
    CompanyEntity toEntity(CompanyDTO companyDTO);
    CompanyDTO toDto(CompanyEntity companyEntity);
}
