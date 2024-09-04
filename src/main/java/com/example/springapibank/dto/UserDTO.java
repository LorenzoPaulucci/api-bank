package com.example.springapibank.dto;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private  String name;
    private  String surname;
    private  String password;
    private  String email;
}
