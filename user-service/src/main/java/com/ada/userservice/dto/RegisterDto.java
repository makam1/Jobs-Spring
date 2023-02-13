package com.ada.userservice.dto;

import java.util.Set;
import java.util.HashSet;
import com.ada.userservice.entities.Role;
import lombok.Data;

@Data
public class RegisterDto {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Set<Role> roles = new HashSet<>();
}
