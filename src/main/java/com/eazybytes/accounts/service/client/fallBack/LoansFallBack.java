package com.eazybytes.accounts.service.client.fallBack;

import com.eazybytes.accounts.dto.LoansDto;
import com.eazybytes.accounts.service.client.LoansFeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class LoansFallBack implements LoansFeignClient {

    @Override
    public ResponseEntity<LoansDto> fetchLoanDetails(String correlationId, String mobileNumber) {
        return null;
    }
}
