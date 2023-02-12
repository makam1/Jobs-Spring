package com.ada.userservice.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ada.userservice.entities.Role;

public interface RoleRepository extends MongoRepository<Role, String>  {
    Optional<Role> findByName(String name);
}
