package com.eazybytes.accounts.service.client.fallBack;

import com.eazybytes.accounts.dto.CardsDto;
import com.eazybytes.accounts.dto.LoansDto;
import com.eazybytes.accounts.service.client.CardsFeignClient;
import com.eazybytes.accounts.service.client.LoansFeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class CardsFallBack implements CardsFeignClient {

    @Override
    public ResponseEntity<CardsDto> fetchCardDetails(String correlationId, String mobileNumber) {
        return null;
    }
}
