package com.example.springapibank.mapper;

import com.example.springapibank.dto.UserDTO;
import com.example.springapibank.entity.User;
import org.mapstruct.Mapper;

import java.util.Optional;

@Mapper(componentModel = "spring")
 public interface UserMapper {
        UserDTO toDto(Optional<User> user);
        User toEntity(UserDTO userDto);
}
