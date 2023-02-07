package com.ada.jobservice.services.CompanyService;

import java.util.List;

import com.ada.jobservice.entities.CompanyEntity;

public interface CompanyService {

	CompanyEntity addCompany (CompanyEntity company) ;
	List<CompanyEntity> getCompany() ;
	CompanyEntity getCompanyById(Integer id) ;
	CompanyEntity editCompany(CompanyEntity company) ;
	void deleteCompany(Integer id) ;
}

