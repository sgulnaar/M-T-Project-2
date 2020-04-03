package com.example.account.web.controller;

import com.example.account.bean.AccountDto;
import com.example.account.service.AccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api(tags = "Account API")
@RestController
@RequestMapping("/v1/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @ApiOperation(value = "Get customer account", produces = "application/json")
    @GetMapping("/customer/{customerId}")
    public ResponseEntity<AccountDto> getCustomerAccount(@PathVariable String customerId) {
        AccountDto customerAccount = accountService.getCustomerAccount(customerId);
        return new ResponseEntity<>(customerAccount, HttpStatus.OK);
    }

    @ApiOperation(value = "Update account balance", produces = "application/json")
    @PutMapping
    public ResponseEntity<AccountDto> updateAccountBalance(@RequestBody AccountDto accountDto) {
        AccountDto dto = accountService.updateAccountBalance(accountDto);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
