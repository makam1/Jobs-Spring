package com.ada.userservice.services;

import java.util.List;

import com.ada.userservice.dto.UserDto;
import com.ada.userservice.entities.User;

public interface UserService {
    List<UserDto> findAll();

    UserDto findById(String id);

    UserDto findByEmail(String email);
    
    List<UserDto> findByRole(String role);
    
    User addUser(User user);

    User updateUser(User user, String id);

    void delete(String id);
}
