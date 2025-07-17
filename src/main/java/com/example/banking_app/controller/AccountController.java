package com.example.banking_app.controller;

import com.example.banking_app.dto.AccountDto;
import com.example.banking_app.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    private final AccountService Accountservice;
    private final AccountService accountService;

    public AccountController(AccountService accountservice, AccountService accountService) {
        Accountservice = accountservice;
        this.accountService = accountService;
    }

    //Add Account REST API
    @PostMapping
    public ResponseEntity<AccountDto> addAcoount (@RequestBody AccountDto accountDto){
        return  new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
    }
    //Get Account REST API
    @GetMapping
    public  ResponseEntity<AccountDto> getAccountBYId(Long id){
        AccountDto accountDto=accountService.getAccountById(id);
        return ResponseEntity.ok(accountDto);
    }


}
