package com.ada.userservice.services;

import java.util.List;

import com.ada.userservice.entities.User;

public interface UserService {
    List<User> getUsers();

    User findById(String id);

    User findByEmail(String email);
    
    List<User> findByRole(String role);
    
    User save(User user);

    User update(User user);

    void delete(String id);
}
