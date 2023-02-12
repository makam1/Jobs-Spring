package com.ada.jobservice.controllers;

import com.ada.jobservice.dto.JobOfferDTO;
import com.ada.jobservice.entities.JobOfferEntity;
import com.ada.jobservice.services.JobOfferService.JobOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
public class JobOfferController {
    private final JobOfferService jobOfferService;
    @Autowired
    public JobOfferController(@Lazy JobOfferService jobOfferService) {

        this.jobOfferService = jobOfferService;
    }
    @PostMapping("/jobOffers")
    public JobOfferDTO createJobOffer(@RequestBody JobOfferDTO jobOffer) {
        return jobOfferService.createJobOffer(jobOffer);
    }
    @GetMapping("/jobOffers")
    public List<JobOfferEntity> getJobOffers() {
        return jobOfferService.getJobOffer();
    }

    @GetMapping("/jobOffers/{id}")
    public JobOfferEntity getJobOffer(@PathVariable String id) {
        return jobOfferService.getJobOfferById(id);
    }

    @PutMapping("/jobOffers/{id}")
    public JobOfferEntity updateJobOffer(@PathVariable(value = "id") String id, @RequestBody JobOfferEntity jobOfferEntity) {
        return jobOfferService.updateJobOffer(id, jobOfferEntity);
    }
    @DeleteMapping("/jobOffers/{id}")
    public void deleteJobOffer(@PathVariable String id) {
        jobOfferService.deleteJobOffer(id);
    }
}
