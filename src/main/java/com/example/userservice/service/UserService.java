package com.example.userservice.service;

import com.example.userservice.dto.UserDto;
import com.example.userservice.jpa.UserEntity;

public interface UserService {
    UserDto getUserByUserId(String userId);
    UserDto createUser(UserDto user);
    Iterable<UserEntity> getUserByAll();
}
