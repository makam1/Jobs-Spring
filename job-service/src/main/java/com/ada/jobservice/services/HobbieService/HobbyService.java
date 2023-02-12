package com.ada.jobservice.services.HobbieService;

import com.ada.jobservice.dto.FormationDTO;
import com.ada.jobservice.dto.HobbyDTO;
import com.ada.jobservice.entities.FormationEntity;
import com.ada.jobservice.entities.HobbiesEntity;

import java.util.List;

public interface HobbyService {
    public List<HobbiesEntity> getHobbies();

    public HobbiesEntity getHobbyById(String id);

    public HobbyDTO createHobby(HobbyDTO hobbyDTO);

    public HobbiesEntity updateHobby(String id, HobbiesEntity hobbyRequest);

    public void deleteHobby(String id);
}
