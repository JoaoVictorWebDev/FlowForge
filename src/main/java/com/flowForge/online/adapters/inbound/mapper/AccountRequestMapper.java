package com.flowforge.online.adapters.inbound.mapper;

import com.flowforge.online.application.dto.request.CreateAccountRequest;
import com.flowforge.online.application.dto.response.CreateAccountResponse;
import com.flowforge.online.domain.enums.AccountStatus;
import com.flowforge.online.domain.model.Account;

import java.time.Instant;

public class AccountRequestMapper {

    public static CreateAccountResponse toResponse(Account account) {
        return new CreateAccountResponse(
                account.getId(),
                account.getCustomerId(),
                account.getAccountNumber()
        );
    }

    public static Account toDomain(CreateAccountRequest request) {
        return new Account(
                request.customerId(),
                request.accountNumber(),
                AccountStatus.PENDING,
                Instant.now()
        );
    }
}
