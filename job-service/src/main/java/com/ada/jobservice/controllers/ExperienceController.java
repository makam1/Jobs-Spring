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
import com.ada.jobservice.dto.ExperienceDTO;
import com.ada.jobservice.entities.ExperienceEntity;
import com.ada.jobservice.services.ExperienceService.ExperienceService;

@RestController
public class ExperienceController {

	private final ExperienceService experienceService ;
	
	@Autowired
    public ExperienceController(@Lazy ExperienceService experienceService) {

        this.experienceService = experienceService;
    }
	
	@PostMapping("/experience")
    public ExperienceDTO createExperience(@RequestBody ExperienceDTO experience) {
        return experienceService.createExperience(experience);
    }

    @GetMapping("/experiences")
    public List<ExperienceEntity> getExperiences() {
        return experienceService.getExperiences();
    }

    @GetMapping("/experience/{id}")
    public ExperienceEntity getExperience(@PathVariable Long id) {
        return experienceService.getExperienceById(id);
    }

    @PutMapping("/experience/{id}")
    public ExperienceEntity updateExperience(@PathVariable(value = "id") Long id, @RequestBody ExperienceEntity experienceEntity) {
        return experienceService.updateExperience(id, experienceEntity);
    }
    @DeleteMapping("/experience/{id}")
    public void deleteExperience(@PathVariable Long id) {
    	experienceService.deleteExperience(id);
    }
}
