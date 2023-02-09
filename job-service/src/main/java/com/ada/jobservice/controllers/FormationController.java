package com.ada.jobservice.controllers;

import com.ada.jobservice.dto.FormationDTO;
import com.ada.jobservice.entities.FormationEntity;
import com.ada.jobservice.services.FormationService.Formationservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
public class FormationController {

    private final Formationservice formationService;

    @Autowired
    public FormationController(@Lazy Formationservice formationService) {

        this.formationService = formationService;
    }

    @PostMapping("/formations")
    public FormationDTO createFormation(@RequestBody FormationDTO formation) {
        return formationService.createFormation(formation);
    }

    @GetMapping("/formations")
    public List<FormationEntity> getFormation() {
        return formationService.getFormations();
    }

    @GetMapping("/formations/{id}")
    public FormationEntity getFormation(@PathVariable String id) {
        return formationService.getFormationById(id);
    }

    @PutMapping("/formations/{id}")
    public FormationEntity updateFormation(@PathVariable(value = "id") String id, @RequestBody FormationEntity formationEntity) {
        return formationService.updateFormation(id, formationEntity);
    }

    @DeleteMapping("/formations/{id}")
    public void deleteFormation(@PathVariable String id) {
        formationService.deleteFormation(id);
    }
}
