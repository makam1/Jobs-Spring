package com.ada.jobservice.controllers;

import com.ada.jobservice.dto.CompanyDTO;
import com.ada.jobservice.dto.ExperienceDTO;
import com.ada.jobservice.entities.CompanyEntity;
import com.ada.jobservice.entities.ExperienceEntity;
import com.ada.jobservice.services.CompanyService.CompanyService;
import com.ada.jobservice.services.ExperienceService.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
public class ExperienceController {
    private final ExperienceService experienceService;

    @Autowired
    public ExperienceController(@Lazy ExperienceService experienceService) {

        this.experienceService = experienceService;
    }

    @PostMapping("/experiences")
    public ExperienceDTO createExperience(@RequestBody ExperienceDTO experience) {
        return experienceService.createExperience(experience);
    }
    @GetMapping("/experiences")
    public List<ExperienceEntity> getExperiences() {
        return experienceService.getExperiences();
    }

    @GetMapping("/experiences/{id}")
    public ExperienceEntity getExperience(@PathVariable String id) {
        return experienceService.getExperienceById(id);
    }

    @PutMapping("/experiences/{id}")
    public ExperienceEntity updateExperience(@PathVariable(value = "id") String id, @RequestBody ExperienceEntity experienceEntity) {
        return experienceService.updateExperience(id, experienceEntity);
    }
    @DeleteMapping("/experiences/{id}")
    public void deleteExperience(@PathVariable String id) {
        experienceService.deleteExperience(id);
    }
}
