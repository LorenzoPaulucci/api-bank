package com.example.springapibank.mapper;

import com.example.springapibank.dto.TransactionDTO;
import com.example.springapibank.entity.Transaction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransactionMapper {

    TransactionDTO toDto(Transaction transaction);
    Transaction toEntity(TransactionDTO transactionDto);
}
