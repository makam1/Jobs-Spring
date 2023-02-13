package com.ada.jobservice.services.ResumeService;

import com.ada.jobservice.dto.ResumeDTO;
import com.ada.jobservice.entities.ResumeEntity;
import java.util.List;

public interface ResumeService {
    public List<ResumeEntity> getResumes();

    public ResumeEntity getResumeById(String id);

    public ResumeDTO createResume(ResumeDTO resumeDTO);

    public ResumeEntity updateResume(String id, ResumeEntity resumeRequest);

    public void deleteResume(String id);
}
