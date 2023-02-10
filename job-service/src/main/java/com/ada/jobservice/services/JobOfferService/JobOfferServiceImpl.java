package com.ada.jobservice.services.JobOfferService;

import com.ada.jobservice.dto.HobbyDTO;
import com.ada.jobservice.dto.JobOfferDTO;
import com.ada.jobservice.entities.HobbiesEntity;
import com.ada.jobservice.entities.JobOfferEntity;
import com.ada.jobservice.mappers.HobbieMapper;
import com.ada.jobservice.mappers.JobOfferMapper;
import com.ada.jobservice.repositories.HobbiRepository;
import com.ada.jobservice.repositories.JobOfferRepository;
import com.ada.jobservice.services.HobbieService.HobbyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobOfferServiceImpl implements JobOfferService{

    private final JobOfferRepository jobOfferRepository;

    private final JobOfferMapper jobOfferMapper;

    private final JobOfferService jobOfferService;

    @Autowired
    public JobOfferServiceImpl(@Lazy JobOfferService jobOfferService, @Lazy JobOfferRepository jobOfferRepository, @Lazy JobOfferMapper jobOfferMapper) {
        this.jobOfferRepository = jobOfferRepository;
        this.jobOfferMapper = jobOfferMapper;
        this.jobOfferService = jobOfferService;
    }
    @Override
    public List<JobOfferEntity> getJobOffer() {
        return jobOfferRepository.findAll();
    }
    @Override
    public JobOfferEntity getJobOfferById(String id) {
        Optional<JobOfferEntity> jobOfferHobby = jobOfferRepository.findById(id);
        return jobOfferHobby.get();
    }

    @Override
    public JobOfferDTO createJobOffer(JobOfferDTO jobOfferDTO) {
        JobOfferEntity jobOfferEntity = jobOfferMapper.toEntity(jobOfferDTO);
        JobOfferEntity jobOfferEntityCreated = jobOfferRepository.save(jobOfferEntity);
        JobOfferDTO jobOfferDTO1 = jobOfferMapper.toDto(jobOfferEntityCreated);
        return jobOfferDTO1;
    }

    @Override
    public JobOfferEntity updateJobOffer(String id, JobOfferEntity jobOfferRequest) {
        Optional<JobOfferEntity> jobOfferExist = jobOfferRepository.findById(id);

        if (!jobOfferExist.isPresent()) {
            return null;
        }

        JobOfferEntity jobOfferEntity = jobOfferExist.get();

        jobOfferEntity.setCompanyAddress(jobOfferRequest.getCompanyAddress());
        jobOfferEntity.setDescription(jobOfferRequest.getDescription());
        jobOfferEntity.setContractType(jobOfferRequest.getContractType());
        jobOfferEntity.setCompanyName(jobOfferRequest.getCompanyName());
        jobOfferEntity.setTitle(jobOfferRequest.getTitle());
        jobOfferEntity.setLimitDate(jobOfferRequest.getLimitDate());
        jobOfferEntity.setMinSalary(jobOfferRequest.getMinSalary());
        jobOfferEntity.setMaxSalary(jobOfferRequest.getMaxSalary());
        jobOfferEntity.setRequiredSkills(jobOfferRequest.getRequiredSkills());

        jobOfferRepository.save(jobOfferEntity);
        return jobOfferEntity;
    }

    @Override
    public void deleteJobOffer(String id) {
        jobOfferRepository.deleteById(id);
    }
}
