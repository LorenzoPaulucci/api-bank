package com.example.springapibank.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class AccountDTO {
    private final UUID userID;
    private final double money;
}
