package com.ada.jobservice.services.SkillService;


import com.ada.jobservice.dto.ResumeDTO;
import com.ada.jobservice.dto.SkillsDTO;
import com.ada.jobservice.entities.ResumeEntity;
import com.ada.jobservice.entities.SkillsEntity;
import com.ada.jobservice.mappers.SkillMapper;
import com.ada.jobservice.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillServiceImpl implements SkillService {
    private final SkillRepository skillRepository;

    private final SkillMapper skillMapper;

    private final SkillService skillService;

    @Autowired
    public SkillServiceImpl(@Lazy SkillService skillService, @Lazy SkillRepository skillRepository, @Lazy SkillMapper skillMapper) {
        this.skillRepository = skillRepository;
        this.skillMapper = skillMapper;
        this.skillService = skillService;
    }

    @Override
    public List<SkillsEntity> getSkills(String user) {
        return skillRepository.findByUser(user);
    }

    @Override
    public SkillsEntity getSkillById(String id) {
        Optional<SkillsEntity> skill= skillRepository.findById(id);
        return skill.get();
    }

    @Override
    public SkillsDTO createSkill(SkillsDTO skillDTO) {
        SkillsEntity skillEntity = skillMapper.toEntity(skillDTO);
        SkillsEntity skillEntityCreated = skillRepository.save(skillEntity);
        SkillsDTO skillDTO1 = skillMapper.toDto(skillEntityCreated);
        return skillDTO1;
    }

    @Override
    public SkillsEntity updateSkill(String id, SkillsEntity skillRequest) {
        Optional<SkillsEntity> skillExist = skillRepository.findById(id);

        if (!skillExist.isPresent()) {
            return null;
        }

        SkillsEntity skillEntity = skillExist.get();
        skillEntity.setName(skillRequest.getName());
        skillEntity.setLevel(skillRequest.getLevel());
        skillRepository.save(skillEntity);

        return skillEntity;
    }

    @Override
    public void deleteSkill(String id) {
        skillRepository.deleteById(id);
    }
}
