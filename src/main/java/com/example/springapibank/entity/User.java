package com.example.springapibank.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter @Setter
@Entity
public class User {
    @Id
    @GeneratedValue(generator = "UUID", strategy = GenerationType.UUID)
    private UUID id;
    @Version
    private String name;
    private String surname;
    private String password;
    private String email;

}
