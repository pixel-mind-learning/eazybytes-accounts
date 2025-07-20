package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDetailDTO;

public interface ICustomersService {

    /**
     * @param mobileNumber  - Input Mobile Number
     * @param correlationId
     * @return Customer Details based on a given mobileNumber
     */
    CustomerDetailDTO fetchCustomerDetails(String mobileNumber, String correlationId);
}
