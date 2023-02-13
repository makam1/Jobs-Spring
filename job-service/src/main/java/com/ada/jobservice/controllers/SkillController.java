package com.ada.jobservice.controllers;

import com.ada.jobservice.dto.SkillsDTO;
import com.ada.jobservice.entities.SkillsEntity;
import com.ada.jobservice.services.SkillService.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
public class SkillController {
    private final SkillService skillService;
    @Autowired
    public SkillController(@Lazy SkillService skillService) {

        this.skillService = skillService;
    }
    @PostMapping("/skills")
    public SkillsDTO createSkill(@RequestBody SkillsDTO skill) {
        return skillService.createSkill(skill);
    }
    @GetMapping("/skills")
    public List<SkillsEntity> getSkills() {
        return skillService.getSkills();
    }

    @GetMapping("/skills/{id}")
    public SkillsEntity getSkill(@PathVariable String id) {
        return skillService.getSkillById(id);
    }

    @PutMapping("/skills/{id}")
    public SkillsEntity updateSkill(@PathVariable(value = "id") String id, @RequestBody SkillsEntity skillEntity) {
        return skillService.updateSkill(id, skillEntity);
    }
    @DeleteMapping("/skills/{id}")
    public void deleteSkill(@PathVariable String id) {
        skillService.deleteSkill(id);
    }
}
