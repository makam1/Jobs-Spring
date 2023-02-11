package com.ada.userservice.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.ada.userservice.entities.enums.UserRole;

import lombok.Data;

@Document(collection = "users")
@Data
public class User implements UserDetails {
  @Id
  private String id;

  // @NotBlank(message="Please enter a firstname")
  private String firstName;

  // @NotBlank(message="Please enter a lastname")
  private String lastName;

  @NotBlank(message="Please enter a email address")
  private String email;

  private String password;

  private List<Role> roles = new ArrayList<>();

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getUsername() {
    // TODO Auto-generated method stub
    return email;
  }

  @Override
  public boolean isAccountNonExpired() {
    // TODO Auto-generated method stub
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    // TODO Auto-generated method stub
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    // TODO Auto-generated method stub
    return true;
  }

  @Override
  public boolean isEnabled() {
    // TODO Auto-generated method stub
    return true;
  }

  public User(String email, String password, Collection<GrantedAuthority> authorities) {    
    this.email = email;
    this.password = password;
    this.roles = authorities.stream()
    .map(grantedAuthority -> new Role(grantedAuthority.toString()))
    .collect(Collectors.toList());
  }

public User() {
}

}
