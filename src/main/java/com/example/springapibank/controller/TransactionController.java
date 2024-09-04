package com.example.springapibank.controller;

import com.example.springapibank.dto.TransactionDTO;
import com.example.springapibank.service.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@RestController
@RequestMapping("/transaction")
@AllArgsConstructor
public class TransactionController {
    TransactionService transactionService;

    @GetMapping("/getAll/{userID}")
    public ArrayList<TransactionDTO> getAllTransaction(@PathVariable("userID") UUID userID) {
        return transactionService.getAllTransaction(userID);
    }

    @PutMapping("/send/{id}")
    public ResponseEntity<String> sendTransaction(@PathVariable("id") UUID idAccount, @RequestBody double money) {
        if(money < 0 || idAccount == null) return ResponseEntity.badRequest().body("Money cant be negative");
        transactionService.sendTransaction(idAccount, money);
        return ResponseEntity.ok("Transaction was successful");
    }
}
