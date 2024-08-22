package com.example.springapibank.mapper;

import com.example.springapibank.dto.AccountDTO;
import com.example.springapibank.entity.Account;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    AccountDTO toDto(Account account);
    Account toEntity(AccountDTO accountDto);
}
