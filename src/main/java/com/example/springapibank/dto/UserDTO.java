package com.example.springapibank.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class UserDTO {
    private final UUID id;
    private final String name;
    private final String surname;
    private final String password;
    private final String email;
}
