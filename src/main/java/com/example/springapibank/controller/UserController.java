package com.example.springapibank.controller;

import com.example.springapibank.dto.UserDTO;
import com.example.springapibank.mapper.UserMapper;
import com.example.springapibank.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    UserService userService;

    @GetMapping("/getUserById/{id}")
    public UserDTO getUserById(@PathVariable("id") UUID id) {

        return userService.getUserById(id);
    }

    @PostMapping("/create")
    public UserDTO saveUser(@RequestBody UserDTO userDTO) {

        return userService.saveUser(userDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable("id") UUID id) {

        userService.deleteUser(id);
    }
}
