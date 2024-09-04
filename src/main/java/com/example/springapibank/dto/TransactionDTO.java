package com.example.springapibank.dto;

import lombok.*;

import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor

public class TransactionDTO {
    private  long id;
    private  String from;
    private  String to;
    private  Date date;
    private  Double amount;
}
