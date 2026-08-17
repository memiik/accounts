package com.memm.accounts.service.impl;

import com.memm.accounts.dto.CustomerDto;
import com.memm.accounts.repository.AccountsRepository;
import com.memm.accounts.repository.CustomerRepository;
import com.memm.accounts.service.AccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements AccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    /**
     *
     * @param customerDto
     */
    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
