package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;

public interface IAccountService {

    void createAccount(CustomerDto customerDto);

    /**
     * @param mobileNumber - Input Mobile Number
     * @return Accounts Details based on a given mobileNumber
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     * @param customerDto - CustomerDto Object
     * @return boolean indicating if the update of account details is successful or not
     */
    boolean updateAccount(@Valid CustomerDto customerDto);

    /**
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicating if the delete of account details is successful or not
     */
    boolean deleteAccount(@Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits") String mobileNumber);

    /**
     * @param accountNumber - Account Number
     * @return boolean indicating if the communication status update is successful or not
     */
    boolean updateCommunicationStatus(Long accountNumber);
}
