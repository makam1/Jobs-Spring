package com.ada.userservice.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ada.userservice.dto.UserDto;
import com.ada.userservice.entities.User;
import com.ada.userservice.services.UserService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PutMapping("/{id}")
    public User updateUser(@RequestBody @Valid User user, @PathVariable String id) {
        return userService.updateUser(user, id);
    }
    
    
    @GetMapping("")
    public List<UserDto> findAll() {
        return userService.findAll();
    }
    
    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable String id) {
            return userService.findById(id);
    }

    @GetMapping("/email={email}")
    public UserDto getUserByEmail(@PathVariable String email) {
            return userService.findByEmail(email);
    }

    @GetMapping("/role={role}")
    public List<UserDto> findAllByRole(@PathVariable String role) {
            return userService.findByRole(role);
    }
    
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        userService.delete(id);
    }

}
