package com.ada.jobservice.services.JobOfferService;

import com.ada.jobservice.dto.HobbyDTO;
import com.ada.jobservice.dto.JobOfferDTO;
import com.ada.jobservice.entities.HobbiesEntity;
import com.ada.jobservice.entities.JobOfferEntity;

import java.util.List;

public interface JobOfferService {
    public List<JobOfferEntity> getJobOffer();

    public JobOfferEntity getJobOfferById(String id);

    public JobOfferDTO createJobOffer(JobOfferDTO jobOfferDTO);

    public JobOfferEntity updateJobOffer(String id, JobOfferEntity jobOfferRequest);

    public void deleteJobOffer(String id);
}
