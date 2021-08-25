package com.example.userservice.service;

import com.example.userservice.dto.UserDto;
import com.example.userservice.jpa.UserEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto getUserByUserId(String userId);
    UserDto getUserByEmail(String email);
    UserDto createUser(UserDto user);
    Iterable<UserEntity> getUserByAll();
}
