package com.eazybytes.accounts.functions;

import com.eazybytes.accounts.service.IAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Slf4j
@Configuration
public class AccountFunction {

    @Bean
    public Consumer<Long> updateCommunication(IAccountService iAccountService) {
        return accountNumber -> {
            log.info("Updating communication status for the account number: {}", accountNumber);
            iAccountService.updateCommunicationStatus(accountNumber);
        };
    }
}
