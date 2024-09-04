package com.example.springapibank.dto;

import lombok.*;

import java.util.UUID;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor

public class AccountDTO {
    private UUID userID;
    private double money;
}

