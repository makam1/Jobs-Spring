package com.ada.jobservice.services.CompanyService;

import com.ada.jobservice.dto.CompanyDTO;
import com.ada.jobservice.entities.CompanyEntity;
import com.ada.jobservice.mappers.CompanyMapper;
import com.ada.jobservice.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;

    private final CompanyMapper companyMapper;

    private final CompanyService companyService;

    @Autowired
    public CompanyServiceImpl(@Lazy CompanyService companyService, @Lazy CompanyRepository companyRepository, @Lazy CompanyMapper companyMapper) {
        this.companyRepository = companyRepository;
        this.companyMapper = companyMapper;
        this.companyService = companyService;
    }
    @Override
    public List<CompanyEntity> getCompanies() {
        return companyRepository.findAll();
    }
    @Override
    public CompanyEntity getCompanyById(String id) {
        Optional<CompanyEntity> optionalCompany = companyRepository.findById(id);
        return optionalCompany.get();
    }
    @Override
    public CompanyDTO createCompany(CompanyDTO companyDTO) {
        CompanyEntity companyEntity = companyMapper.toEntity(companyDTO);
        // Sauvegarde du restaurant entité au niveau de la BDD
        CompanyEntity companyEntityCreated = companyRepository.save(companyEntity);
        // Conversion automatique de entité en dto
        CompanyDTO companyDTO1 = companyMapper.toDto(companyEntityCreated);
        // On retourne de dto crée
        return companyDTO1;
    }

    @Override
    public CompanyEntity updateCompany(String id, CompanyEntity companyRequest) {
        Optional<CompanyEntity> companyExist = companyRepository.findById(id);

        if (!companyExist.isPresent()) {
            return null;
        }

        CompanyEntity companyEntity = companyExist.get();

        companyEntity.setDenomination(companyRequest.getDenomination());
        companyEntity.setDescription(companyRequest.getDescription());
        companyEntity.setDomain(companyRequest.getDomain());
        companyEntity.setNinea(companyRequest.getNinea());
        companyEntity.setHeadquaters(companyRequest.getHeadquaters());
        companyEntity.setOfficePhone(companyRequest.getOfficePhone());
        companyEntity.setSector(companyRequest.getSector());

        companyRepository.save(companyEntity);
        return companyEntity;
    }

    @Override
    public void deleteCompany(String id) {
        companyRepository.deleteById(id);
    }
}
