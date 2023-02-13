package com.ada.userservice.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ada.userservice.entities.enums.UserRole;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "roles")
public class Role {

    @Id
    private String id;

    private UserRole name;

    public Role() {

    }

    public Role(String role) {
        switch (role) {
            case "ADMIN":
                this.name = UserRole.ADMIN;
                break;
            case "RECRUITER":
                this.name = UserRole.RECRUITER;
                break;
            default:
                this.name = UserRole.JOBSEEKER;
                break;
        }
    }
}
