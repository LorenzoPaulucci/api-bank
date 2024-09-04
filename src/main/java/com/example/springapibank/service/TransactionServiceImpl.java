package com.example.springapibank.service;

import com.example.springapibank.dto.TransactionDTO;
import com.example.springapibank.entity.Account;
import com.example.springapibank.entity.User;
import com.example.springapibank.mapper.TransactionMapper;
import com.example.springapibank.repository.AccountRepository;
import com.example.springapibank.repository.TransactionRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;
@Service
@AllArgsConstructor
@Slf4j
public class TransactionServiceImpl implements TransactionService {
    TransactionMapper transactionMapper;
    TransactionRepository transactionRepository;
    AccountRepository AccountRepository;
    @Override
    public ArrayList<TransactionDTO> getAllTransaction(UUID userID) {
        ArrayList<TransactionDTO> transactionDTOS = new ArrayList<>();
        transactionDTOS.add(transactionMapper.toDto(transactionRepository.findAllByUserID(userID)));
        return transactionDTOS;
    }

    @Override
    public void sendTransaction(UUID idAccount, double money) {

        Optional<Account> account = AccountRepository.findById(idAccount);

        // FALTA HACER LA COMPROBACION DE QUE EL EMISOR TENGA SUFICIENTE DINERO

        account.ifPresent(account1 -> {
            account1.setMoney(account1.getMoney() + money);
            AccountRepository.save(account1);
        });

    }
}
