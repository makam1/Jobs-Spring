package com.ada.userservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.ada.userservice.entities.Role;
import lombok.Data;

@Data
public class UserDto {
    
    private String id;

    private String firstName;

    private String lastName;

    private String email;

    private List<Role> roles = new ArrayList<Role>();

}
