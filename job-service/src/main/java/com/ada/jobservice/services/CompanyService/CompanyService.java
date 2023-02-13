package com.ada.jobservice.services.CompanyService;

import com.ada.jobservice.dto.CompanyDTO;
import com.ada.jobservice.dto.FormationDTO;
import com.ada.jobservice.entities.CompanyEntity;
import com.ada.jobservice.entities.FormationEntity;

import java.util.List;

public interface CompanyService {
    public List<CompanyEntity> getCompanies();

    public CompanyEntity getCompanyById(String id);

    public CompanyDTO createCompany(CompanyDTO companyDTO);

    public CompanyEntity updateCompany(String id, CompanyEntity companyRequest);

    public void deleteCompany(String id);
}
