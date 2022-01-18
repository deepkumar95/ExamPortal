package com.example.ExamPortal.services;

import com.example.ExamPortal.entities.User;
import com.example.ExamPortal.entities.UserRole;

import java.util.Set;

public interface UserService {
    public User createUser(User user, Set<UserRole> userRoles);
}
