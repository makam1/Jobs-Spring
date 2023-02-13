package com.ada.jobservice.services.SkillService;

import com.ada.jobservice.dto.ResumeDTO;
import com.ada.jobservice.dto.SkillsDTO;
import com.ada.jobservice.entities.ResumeEntity;
import com.ada.jobservice.entities.SkillsEntity;

import java.util.List;

public interface SkillService {
    public List<SkillsEntity> getSkills();

    public SkillsEntity getSkillById(String id);

    SkillsDTO createSkill(SkillsDTO skillDTO);

    public SkillsEntity updateSkill(String id, SkillsEntity skillRequest);

    public void deleteSkill(String id);
}
