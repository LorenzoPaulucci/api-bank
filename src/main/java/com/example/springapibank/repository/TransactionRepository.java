package com.example.springapibank.repository;

import com.example.springapibank.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    Transaction findAllByUserID(UUID userID);
}
