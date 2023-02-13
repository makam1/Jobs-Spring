package com.ada.userservice.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ada.userservice.entities.User;
public interface UserRepository extends MongoRepository<User, String> {
    @Query("{role:'?0'}")
    List<User> findByRole(String role);

    @Query("{email:'?0'}")
    Optional<User> findByEmail(String email);
    
    @Query("{email:'?0'}")
    boolean existsEmail(String email);
    
}
