package com.example.banking_app.dto;

import lombok.Data;

@Data
public class AccountDto {
    private Long id;
    private String accountHolderName;
    private Double balance;
}
