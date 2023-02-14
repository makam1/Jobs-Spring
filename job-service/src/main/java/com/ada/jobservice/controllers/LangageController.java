package com.ada.jobservice.controllers;

import com.ada.jobservice.dto.JobOfferDTO;
import com.ada.jobservice.dto.LangageDTO;
import com.ada.jobservice.entities.JobOfferEntity;
import com.ada.jobservice.entities.LangageEntity;
import com.ada.jobservice.services.JobOfferService.JobOfferService;
import com.ada.jobservice.services.LangageService.LangageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
public class LangageController {
    private final LangageService langageService;
    @Autowired
    public LangageController(@Lazy LangageService langageService) {

        this.langageService = langageService;
    }
    @PostMapping("/langages")
    public LangageDTO createLangage(@RequestBody LangageDTO langage) {
        return langageService.createLangage(langage);
    }
    @GetMapping("/langages/{user}")
    public List<LangageEntity> getLangages(@PathVariable String user) {
        return langageService.getLangages(user);
    }

    @GetMapping("/langage/{id}")
    public LangageEntity getLangage(@PathVariable String id) {
        return langageService.getLangageById(id);
    }

    @PutMapping("/langages/{id}")
    public LangageEntity updateLangage(@PathVariable(value = "id") String id, @RequestBody LangageEntity langageEntity) {
        return langageService.updateLangage(id, langageEntity);
    }
    @DeleteMapping("/langages/{id}")
    public void deleteLangage(@PathVariable String id) {
        langageService.deleteLangage(id);
    }
}
