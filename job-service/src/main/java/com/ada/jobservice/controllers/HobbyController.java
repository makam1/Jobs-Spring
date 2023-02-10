package com.ada.jobservice.controllers;

import com.ada.jobservice.dto.HobbyDTO;
import com.ada.jobservice.entities.HobbiesEntity;
import com.ada.jobservice.services.HobbieService.HobbyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
public class HobbyController {
    private final HobbyService hobbyService;
    @Autowired
    public HobbyController(@Lazy HobbyService hobbyService) {

        this.hobbyService = hobbyService;
    }
    @PostMapping("/hobbies")
    public HobbyDTO createHobby(@RequestBody HobbyDTO hobby) {
        return hobbyService.createHobby(hobby);
    }
    @GetMapping("/hobbies")
    public List<HobbiesEntity> getHobbies() {
        return hobbyService.getHobbies();
    }

    @GetMapping("/hobbies/{id}")
    public HobbiesEntity getHobby(@PathVariable String id) {
        return hobbyService.getHobbyById(id);
    }

    @PutMapping("/hobbies/{id}")
    public HobbiesEntity updateHobby(@PathVariable(value = "id") String id, @RequestBody HobbiesEntity hobbyEntity) {
        return hobbyService.updateHobby(id, hobbyEntity);
    }
    @DeleteMapping("/hobbies/{id}")
    public void deleteHobby(@PathVariable String id) {
        hobbyService.deleteHobby(id);
    }
}
