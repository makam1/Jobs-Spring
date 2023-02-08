package com.ada.userservice.entities;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ada.userservice.entities.enums.UserRole;

@Document(collection = "users")
public class User {
  @Id
  private String id;

  @NotBlank(message="Please enter a firstname")
  private String firstName;

  @NotBlank(message="Please enter a lastname")
  private String lastName;

  @NotBlank(message="Please enter a email address")
  private String email;

  private UserRole role;

  public User(String firstName, String lastName, String email, UserRole role) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.role = role;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserRole getRole() {
    return role;
  }

  public void setRole(UserRole role) {
    this.role = role;
  }
}
