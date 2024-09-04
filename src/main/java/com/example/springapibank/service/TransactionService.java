package com.example.springapibank.service;

import com.example.springapibank.dto.TransactionDTO;

import java.util.ArrayList;
import java.util.UUID;

public interface TransactionService {
    ArrayList<TransactionDTO> getAllTransaction(UUID userID);
    void sendTransaction(UUID id, double money);


}
