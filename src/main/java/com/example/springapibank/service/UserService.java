package com.example.springapibank.service;

import com.example.springapibank.dto.UserDTO;

import java.util.UUID;

public interface UserService {
    UserDTO getUserById(UUID id);
    void deleteUser(UUID id);
    UserDTO saveUser(UserDTO userDTO);
}
