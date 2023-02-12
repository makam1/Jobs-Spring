package com.ada.jobservice.controllers;

import com.ada.jobservice.dto.ResumeDTO;
import com.ada.jobservice.entities.ResumeEntity;
import com.ada.jobservice.services.ResumeService.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
public class ResumeController {
    private final ResumeService resumeService;
    @Autowired
    public ResumeController(@Lazy ResumeService resumeService) {

        this.resumeService = resumeService;
    }
    @PostMapping("/resumes")
    public ResumeDTO createResume(@RequestBody ResumeDTO resume) {
        return resumeService.createResume(resume);
    }
    @GetMapping("/resumes")
    public List<ResumeEntity> getResumes() {
        return resumeService.getResumes();
    }

    @GetMapping("/resumes/{id}")
    public ResumeEntity getResume(@PathVariable String id) {
        return resumeService.getResumeById(id);
    }

    @PutMapping("/resumes/{id}")
    public ResumeEntity updateResume(@PathVariable(value = "id") String id, @RequestBody ResumeEntity resumeEntity) {
        return resumeService.updateResume(id, resumeEntity);
    }
    @DeleteMapping("/resumes/{id}")
    public void deleteResume(@PathVariable String id) {
        resumeService.deleteResume(id);
    }
}
