package com.example.springapibank.dto;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private  String name;
    private  String surname;
    private  String password;
    private  String email;
}
