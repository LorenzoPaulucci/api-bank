package com.example.springapibank.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
@Entity
public class Transactions {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Version
    private String from;
    private String to;
    private Date date;
    private Double amount;

}
