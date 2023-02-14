package com.ada.userservice.dto;

import java.util.Set;

import com.ada.userservice.entities.Role;
import com.ada.userservice.entities.User;

import lombok.Data;

@Data
public class AuthResponseDto {
    private String id;
    private String accessToken;
    private String tokenType = "Bearer ";
    private String firstanme;
    private String lastname;
    private String email;
    private Set<Role> roles;

    public AuthResponseDto(String accessToken, UserDto user) {
        this.id = user.getId();
        this.accessToken = accessToken;
        this.firstanme = user.getFirstName();
        this.lastname = user.getLastName();
        this.email = user.getEmail();
        this.roles = user.getRoles();
    }
}
