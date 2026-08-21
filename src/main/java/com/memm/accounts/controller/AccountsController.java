package com.memm.accounts.controller;

import com.memm.accounts.constants.AccountsConstants;
import com.memm.accounts.dto.CustomerDto;
import com.memm.accounts.dto.ResponseDto;
import com.memm.accounts.service.AccountsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class AccountsController {

    private AccountsService accountsService;

    @PostMapping("/create-account")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto) {

        accountsService.createAccount(customerDto);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201));
    }

}
