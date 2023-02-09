package com.ada.userservice.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ada.userservice.dto.UserDto;
import com.ada.userservice.entities.User;
import com.ada.userservice.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    public final UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;

    public UserServiceImpl (UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public User addUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public  List<UserDto> findAll() {
        List<User> users = this.userRepository.findAll();
        return users.stream().map(user -> this.modelMapper.map(user, UserDto.class)).collect(Collectors.toList());
    }

    @Override
    public List<UserDto> findByRole(String role){
        List<User> users = this.userRepository.findByRole(role);
        return users.stream().map(user -> this.modelMapper.map(user, UserDto.class)).collect(Collectors.toList());
    }
    
    @Override
    public UserDto findById(String id){
        User user =  this.userRepository.findById(id).get();
        UserDto userDto = this.modelMapper.map(user, UserDto.class);
        return userDto;
    }

    @Override
    public UserDto findByEmail(String email) {
        User user = this.userRepository.findByEmail(email);
        return this.modelMapper.map(user, UserDto.class);
    }
    
    // @Override
    // public <User> findByName(String name) {
    //     return this.userRepository.findByName(name);
    // }
    
    @Override
    public User updateUser(User user, String userId) {
        user.setId(userId);
        return this.userRepository.save(user);
    }

    @Override
    public void delete(String id) {
        this.userRepository.deleteById(id);
    }
}
