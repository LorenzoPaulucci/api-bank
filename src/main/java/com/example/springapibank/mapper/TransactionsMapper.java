package com.example.springapibank.mapper;

import com.example.springapibank.dto.TransactionsDTO;
import com.example.springapibank.entity.Transactions;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransactionsMapper {

    TransactionsDTO toDto(Transactions transactions);
    Transactions toEntity(TransactionsDTO transactionsDto);
}
