package com.ada.jobservice.services.ResumeService;

import com.ada.jobservice.dto.ResumeDTO;
import com.ada.jobservice.entities.ResumeEntity;
import com.ada.jobservice.mappers.ResumeMapper;
import com.ada.jobservice.repositories.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResumeServiceImpl implements ResumeService{
    private final ResumeRepository resumeRepository;

    private final ResumeMapper resumeMapper;

    private final ResumeService resumeService;

    @Autowired
    public ResumeServiceImpl(@Lazy ResumeService resumeService, @Lazy ResumeRepository resumeRepository, @Lazy ResumeMapper resumeMapper) {
        this.resumeRepository = resumeRepository;
        this.resumeMapper = resumeMapper;
        this.resumeService = resumeService;
    }
    @Override
    public List<ResumeEntity> getResumes() {
        return resumeRepository.findAll();
    }

    @Override
    public ResumeEntity getResumeById(String id) {
        Optional<ResumeEntity> resume= resumeRepository.findById(id);
        return resume.get();
    }

    @Override
    public ResumeDTO createResume(ResumeDTO resumeDTO) {
        ResumeEntity resumeEntity = resumeMapper.toEntity(resumeDTO);
        ResumeEntity resumeEntityCreated = resumeRepository.save(resumeEntity);
        ResumeDTO resumeDTO1 = resumeMapper.toDto(resumeEntityCreated);
        return resumeDTO1;
    }

    @Override
    public ResumeEntity updateResume(String id, ResumeEntity resumeRequest) {
        Optional<ResumeEntity> resumeExist = resumeRepository.findById(id);

        if (!resumeExist.isPresent()) {
            return null;
        }

        ResumeEntity resumeEntity = resumeExist.get();
        resumeEntity.setTitle(resumeRequest.getTitle());
        resumeEntity.setDateOfBirth(resumeRequest.getDateOfBirth());
        resumeRepository.save(resumeEntity);

        return resumeEntity;
    }

    @Override
    public void deleteResume(String id) {
        resumeRepository.deleteById(id);

    }
}
