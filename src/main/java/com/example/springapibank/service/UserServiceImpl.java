package com.example.springapibank.service;

import com.example.springapibank.dto.UserDTO;
import com.example.springapibank.mapper.UserMapper;
import com.example.springapibank.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserDTO getUserById(UUID id) {
        return userMapper.toDto(userRepository.findById(id));
    }

    @Override
    public void deleteUser(UUID id) {
        userRepository.deleteById(id);
        log.info("User with id: {} was deleted", id);
    }

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        System.out.println(userMapper.toEntity(userDTO));
        return userDTO; //userMapper.toDto((java.util.Optional.of(userRepository.save(userMapper.toEntity(userDTO)))));
    }
}
