package com.ada.jobservice.services.CompanyService;

import java.util.List;

import com.ada.jobservice.entities.CompanyEntity;
import com.ada.jobservice.repositories.CompanyRepository;

public class CompanyServiceImpl implements CompanyService {
	private final CompanyRepository repo ;

	public CompanyServiceImpl(CompanyRepository repo ) {
		this.repo = repo ;
	}
	
	@Override
	public CompanyEntity addCompany(CompanyEntity company) {
		return repo.save(company);
	}

	@Override
	public List<CompanyEntity> getCompany() {
		return repo.findAll();
	}

	@Override
	public CompanyEntity getCompanyById(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	public CompanyEntity editCompany(CompanyEntity company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCompany(Integer id) {
		repo.deleteById(id) ;

	}

}
