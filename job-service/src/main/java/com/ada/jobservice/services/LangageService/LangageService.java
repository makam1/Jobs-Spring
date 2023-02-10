package com.ada.jobservice.services.LangageService;

import com.ada.jobservice.dto.JobOfferDTO;
import com.ada.jobservice.dto.LangageDTO;
import com.ada.jobservice.entities.JobOfferEntity;
import com.ada.jobservice.entities.LangageEntity;

import java.util.List;

public interface LangageService {
    public List<LangageEntity> getLangages();

    public LangageEntity getLangageById(String id);

    public LangageDTO createLangage(LangageDTO langageDTO);

    public LangageEntity updateLangage(String id, LangageEntity langageRequest);

    public void deleteLangage(String id);
}
