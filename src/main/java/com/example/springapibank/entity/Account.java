package com.example.springapibank.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.UUID;

@Getter @Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Account {

    @Id
    @GeneratedValue(generator = "UUID")
    @JdbcTypeCode(SqlTypes.CHAR) // esto es para que almacene el UUID como una cadena de caracteres y no en binario
    private UUID id_account;

    private double money;
    private UUID userID;



}
