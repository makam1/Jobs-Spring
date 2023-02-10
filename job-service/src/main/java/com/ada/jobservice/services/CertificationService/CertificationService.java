package com.ada.jobservice.services.CertificationService;

import java.util.List;

import com.ada.jobservice.dto.CertificationDTO;
import com.ada.jobservice.entities.CertificationEntity;


public interface CertificationService {

	public List<CertificationEntity> getCertifications();

    public CertificationEntity getCertificationById(Long id);

    public CertificationDTO createCertification(CertificationDTO certificationDTO);

    public CertificationEntity updateCertification(Long id, CertificationEntity certificationRequest);

    public void deleteCertification(Long id);
}
