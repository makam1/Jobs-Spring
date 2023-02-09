package com.ada.jobservice.controllers;

import com.ada.jobservice.dto.CompanyDTO;
import com.ada.jobservice.entities.CompanyEntity;
import com.ada.jobservice.services.CompanyService.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
public class CompanyController {
    private final CompanyService companyService;

    @Autowired
    public CompanyController(@Lazy CompanyService companyService) {

        this.companyService = companyService;
    }

    @PostMapping("/companies")
    public CompanyDTO createCompany(@RequestBody CompanyDTO company) {
        return companyService.createCompany(company);
    }

    @GetMapping("/companies")
    public List<CompanyEntity> getCompanies() {
        return companyService.getCompanies();
    }

    @GetMapping("/companies/{id}")
    public CompanyEntity getCompany(@PathVariable String id) {
        return companyService.getCompanyById(id);
    }

    @PutMapping("/companies/{id}")
    public CompanyEntity updateCompany(@PathVariable(value = "id") String id, @RequestBody CompanyEntity companyEntity) {
        return companyService.updateCompany(id, companyEntity);
    }
    @DeleteMapping("/companies/{id}")
    public void deleteCompany(@PathVariable String id) {
        companyService.deleteCompany(id);
    }
}
