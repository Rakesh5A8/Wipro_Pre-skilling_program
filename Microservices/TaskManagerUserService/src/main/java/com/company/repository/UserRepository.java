package com.company.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.company.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
    boolean existsByUsername(String username);
}