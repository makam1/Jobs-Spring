package com.ada.userservice.services;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ada.userservice.dto.UserDto;

import com.ada.userservice.entities.Role;
import com.ada.userservice.entities.User;

import com.ada.userservice.entities.enums.UserRole ;

import com.ada.userservice.repositories.RoleRepository;
import com.ada.userservice.repositories.UserRepository;


@Service
public class UserServiceImpl implements UserService {
    public final UserRepository userRepository;
    public final RoleRepository roleRepository;
    @Autowired
    private ModelMapper modelMapper;

    public UserServiceImpl (UserRepository userRepository, RoleRepository roleRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public User addUser(User RegisterUser) {
        Set<Role> ListRoles = RegisterUser.getRoles();
		Set<Role> roles = new HashSet<>();

        if (ListRoles == null) {
			Role userRole = roleRepository.findByName(UserRole.JOBSEEKER.toString())
					.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
			roles.add(userRole);
		} else {
			ListRoles.forEach(role -> {
				switch (role.toString()) {
				case "ADMIN":
					Role adminRole = roleRepository.findByName(UserRole.ADMIN.toString())
							.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
					roles.add(adminRole);

					break;
				case "RECRUITER":
					Role modRole = roleRepository.findByName(UserRole.RECRUITER.toString())
							.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
					roles.add(modRole);

					break;
				default:
					Role userRole = roleRepository.findByName(UserRole.JOBSEEKER.toString())
							.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
					roles.add(userRole);
				}
			});
		}
        User user = new User(RegisterUser.getFirstName(), RegisterUser.getLastName(), RegisterUser.getEmail(), RegisterUser.getPassword(), roles);
        return this.userRepository.insert(user);
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
        Optional<User> user = this.userRepository.findByEmail(email);
        return this.modelMapper.map(user, UserDto.class);
    }
    
    // @Override
    // public <User> findByName(String name) {
    //     return this.userRepository.findByName(name);
    // }
    
    @Override
    public User updateUser(User user, String id) {
        Optional<User> oldUser =  this.userRepository.findById(id);

        if (oldUser.isPresent()) {
            User updatedUser = oldUser.get();
            updatedUser.setFirstName(user.getFirstName());
            updatedUser.setLastName(user.getLastName());
            updatedUser.setEmail(user.getEmail());
            updatedUser.setRoles(user.getRoles());
            return this.userRepository.save(updatedUser);
        }

        return null;//NOT FOUND
    }

    @Override
    public void delete(String id) {
        this.userRepository.deleteById(id);
    }

    @Override
    public Boolean existsEmail(String email){
        return this.userRepository.existsEmail(email);
    }
}
