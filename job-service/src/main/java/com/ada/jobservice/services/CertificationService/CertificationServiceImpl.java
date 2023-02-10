package com.ada.jobservice.services.CertificationService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import com.ada.jobservice.dto.CertificationDTO;
import com.ada.jobservice.entities.CertificationEntity;
import com.ada.jobservice.mappers.CertificationMapper;
import com.ada.jobservice.repositories.CertificationRepository;

public class CertificationServiceImpl implements CertificationService {
	
	private final CertificationRepository certificationRepository;

    private final CertificationMapper certificationMapper;

    private final CertificationService certificationService;


    @Autowired
    public CertificationServiceImpl(@Lazy CertificationService certificationService, @Lazy CertificationRepository certificationRepository, @Lazy CertificationMapper certificationMapper) {
        this.certificationRepository = certificationRepository;
        this.certificationMapper = certificationMapper;
        this.certificationService = certificationService;
    }
    
	@Override
	public List<CertificationEntity> getCertifications() {
		return certificationRepository.findAll();
	}

	@Override
	public CertificationEntity getCertificationById(Long id) {
		// TODO Auto-generated method stub
		return certificationRepository.findById(id).get() ;
	}

	@Override
	public CertificationDTO createCertification(CertificationDTO certificationDTO) {
		  CertificationEntity certificationEntity = certificationMapper.toEntity(certificationDTO);
	      // Sauvegarde du restaurant entité au niveau de la BDD
		  CertificationEntity certificationEntityCreated = certificationRepository.save(certificationEntity);
	      // Conversion automatique de entité en dto
	      CertificationDTO certificationDTO1 = certificationMapper.toDto(certificationEntityCreated);
	      // On retourne de dto crée
	      return certificationDTO1;
	}

	@Override
	public CertificationEntity updateCertification(Long id, CertificationEntity certificationRequest) {
		Optional<CertificationEntity> certificationExist = certificationRepository.findById(id);

        if (!certificationExist.isPresent()) {
            return null;
        }

        CertificationEntity certificationEntity = certificationExist.get();

        certificationEntity.setTitle(certificationRequest.getTitle());
        certificationEntity.setFileName(certificationRequest.getFileName());

        certificationRepository.save(certificationEntity);
        return certificationEntity;
	}

	@Override
	public void deleteCertification(Long id) {
		certificationRepository.deleteById(id);

	}

}
