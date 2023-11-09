package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
    
    List<User> findByNome(String nome);
    
    Optional<User> findById(Long id);
}
