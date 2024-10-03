package com.project.blogapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.blogapp.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {
    
}
