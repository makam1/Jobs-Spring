package com.ada.userservice.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ada.userservice.entities.User;
import com.ada.userservice.entities.enums.UserRole;
import com.ada.userservice.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public  List<User> getUsers() {
        return this.userRepository.findAll();
    }

    @Override
    public List<User> findByRole(String role){
        return this.userRepository.findByRole(role);
    }
    
    @Override
    public User findById(String id){
        return this.userRepository.findById(id).get();
    }

    @Override
    public User findByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }
    
    // @Override
    // public <User> findByName(String name) {
    //     return this.userRepository.findByName(name);
    // }
    
    @Override
    public User save(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User update(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public void delete(String id) {
        this.userRepository.delete(findById(id));
    }
}
