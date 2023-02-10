package com.ada.jobservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ada.jobservice.dto.CertificationDTO;
import com.ada.jobservice.entities.CertificationEntity;
import com.ada.jobservice.services.CertificationService.CertificationService;

@RestController
public class CertificationController {
	private final CertificationService certificationservice ;
	
	@Autowired
    public CertificationController(@Lazy CertificationService certificationservice) {

        this.certificationservice = certificationservice;
    }
	
	@PostMapping("/certification")
    public CertificationDTO createCertification(@RequestBody CertificationDTO certification) {
        return certificationservice.createCertification(certification);
    }

    @GetMapping("/certifications")
    public List<CertificationEntity> getCompanies() {
        return certificationservice.getCertifications();
    }

    @GetMapping("/certification/{id}")
    public CertificationEntity getCertification(@PathVariable Long id) {
        return certificationservice.getCertificationById(id);
    }

    @PutMapping("/certification/{id}")
    public CertificationEntity updateCertification(@PathVariable(value = "id") Long id, @RequestBody CertificationEntity certificationEntity) {
        return certificationservice.updateCertification(id, certificationEntity);
    }
    @DeleteMapping("/certification/{id}")
    public void deleteCertification(@PathVariable Long id) {
    	certificationservice.deleteCertification(id);
    }

}
