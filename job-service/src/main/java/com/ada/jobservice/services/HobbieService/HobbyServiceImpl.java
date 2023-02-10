package com.ada.jobservice.services.HobbieService;

import com.ada.jobservice.dto.ExperienceDTO;
import com.ada.jobservice.dto.HobbyDTO;
import com.ada.jobservice.entities.ExperienceEntity;
import com.ada.jobservice.entities.HobbiesEntity;
import com.ada.jobservice.mappers.ExperienceMapper;
import com.ada.jobservice.mappers.HobbieMapper;
import com.ada.jobservice.repositories.ExperienceRepository;
import com.ada.jobservice.repositories.HobbiRepository;
import com.ada.jobservice.services.ExperienceService.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class HobbyServiceImpl implements HobbyService{
    private final HobbiRepository hobbyRepository;

    private final HobbieMapper hobbyMapper;

    private final HobbyService hobbyService;

    @Autowired
    public HobbyServiceImpl(@Lazy HobbyService hobbyService, @Lazy HobbiRepository hobbyRepository, @Lazy HobbieMapper hobbyMapper) {
        this.hobbyRepository = hobbyRepository;
        this.hobbyMapper = hobbyMapper;
        this.hobbyService = hobbyService;
    }
    @Override
    public List<HobbiesEntity> getHobbies() {
        return hobbyRepository.findAll();
    }

    @Override
    public HobbiesEntity getHobbyById(String id) {
        Optional<HobbiesEntity> optionalHobby = hobbyRepository.findById(id);
        return optionalHobby.get();
    }

    @Override
    public HobbyDTO createHobby(HobbyDTO hobbyDTO) {
        HobbiesEntity hobbyEntity = hobbyMapper.toEntity(hobbyDTO);
        HobbiesEntity hobbyEntityCreated = hobbyRepository.save(hobbyEntity);
        HobbyDTO hobbyDTO1 = hobbyMapper.toDto(hobbyEntityCreated);
        return hobbyDTO1;
    }

    @Override
    public HobbiesEntity updateHobby(String id, HobbiesEntity hobbyRequest) {
        Optional<HobbiesEntity> hobbyExist = hobbyRepository.findById(id);

        if (!hobbyExist.isPresent()) {
            return null;
        }

        HobbiesEntity hobbyEntity = hobbyExist.get();

        hobbyEntity.setName(hobbyRequest.getName());


        hobbyRepository.save(hobbyEntity);
        return hobbyEntity;
    }

    @Override
    public void deleteHobby(String id) {
        hobbyRepository.deleteById(id);
    }
}
