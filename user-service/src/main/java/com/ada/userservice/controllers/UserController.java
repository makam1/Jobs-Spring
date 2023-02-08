package com.ada.userservice.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ada.userservice.entities.User;
import com.ada.userservice.services.UserService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("")
    public User addUser(@RequestBody @Valid User user) {
        return userService.save(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@RequestBody @Valid User user) {
        return userService.update(user);
    }
    
    
    @GetMapping("")
    public List<User> getUsers() {
        return userService.getUsers();
    }
    
    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") String id) {
            return userService.findById(id);
    }

    @GetMapping("/{email}")
    public User getUserByEmail(@PathVariable("email") String email) {
            return userService.findByEmail(email);
    }

    @GetMapping("/role/{role}")
    public List<User> getUsersByRole(@PathVariable("role") String role) {
            return userService.findByRole(role);
    }
    
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        userService.delete(id);
    }

}
