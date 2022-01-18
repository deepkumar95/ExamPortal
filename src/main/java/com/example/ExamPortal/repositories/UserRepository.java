package com.example.ExamPortal.repositories;

import com.example.ExamPortal.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findUserByUserName(String username);
}
