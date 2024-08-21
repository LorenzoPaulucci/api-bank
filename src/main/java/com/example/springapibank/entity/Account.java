package com.example.springapibank.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
@Entity
public class Account {

    @Id
    private UUID userID;
    @Version
    private double money;



}
