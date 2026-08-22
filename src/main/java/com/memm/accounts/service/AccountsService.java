package com.memm.accounts.service;

import com.memm.accounts.dto.CustomerDto;

public interface AccountsService {

    /**
     *
     * @param customerDto
     */
    void createAccount(CustomerDto customerDto);

    CustomerDto getAccountDetails(String mobileNumber);
}
