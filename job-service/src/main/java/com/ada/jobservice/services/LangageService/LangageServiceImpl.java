package com.ada.jobservice.services.LangageService;

import com.ada.jobservice.dto.JobOfferDTO;
import com.ada.jobservice.dto.LangageDTO;
import com.ada.jobservice.entities.JobOfferEntity;
import com.ada.jobservice.entities.LangageEntity;
import com.ada.jobservice.mappers.HobbieMapper;
import com.ada.jobservice.mappers.LangageMapper;
import com.ada.jobservice.repositories.HobbiRepository;
import com.ada.jobservice.repositories.LangageRepository;
import com.ada.jobservice.services.HobbieService.HobbyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LangageServiceImpl implements LangageService{
    private final LangageRepository langageRepository;

    private final LangageMapper langageMapper;

    private final LangageService langageService;

    @Autowired
    public LangageServiceImpl(@Lazy LangageService langageService, @Lazy LangageRepository langageRepository, @Lazy LangageMapper langageMapper) {
        this.langageRepository = langageRepository;
        this.langageMapper = langageMapper;
        this.langageService = langageService;
    }
    @Override
    public List<LangageEntity> getLangages(String user) {
        return langageRepository.findByUser(user);
    }

    @Override
    public LangageEntity getLangageById(String id) {
        Optional<LangageEntity> langageHobby = langageRepository.findById(id);
        return langageHobby.get();
    }

    @Override
    public LangageDTO createLangage(LangageDTO langageDTO) {
        LangageEntity langageEntity = langageMapper.toEntity(langageDTO);
        LangageEntity langageEntityCreated = langageRepository.save(langageEntity);
        LangageDTO langageDTO1 = langageMapper.toDto(langageEntityCreated);
        return langageDTO1;
    }

    @Override
    public LangageEntity updateLangage(String id, LangageEntity langageRequest) {
        Optional<LangageEntity> langageExist = langageRepository.findById(id);

        if (!langageExist.isPresent()) {
            return null;
        }

        LangageEntity langageEntity = langageExist.get();

        langageEntity.setName(langageRequest.getName());
        langageEntity.setLevel(langageRequest.getLevel());

        langageRepository.save(langageEntity);
        return langageEntity;
    }

    @Override
    public void deleteLangage(String id) {
        langageRepository.deleteById(id);

    }
}
