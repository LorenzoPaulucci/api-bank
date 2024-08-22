package com.example.springapibank.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class TransactionsDTO {
    private final long id;
    private final String from;
    private final String to;
    private final Date date;
    private final Double amount;
}
