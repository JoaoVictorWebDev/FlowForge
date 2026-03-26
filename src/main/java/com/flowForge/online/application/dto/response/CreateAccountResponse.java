package com.flowforge.online.application.dto.response;

import com.flowforge.online.domain.enums.AccountStatus;

import java.time.Instant;
import java.util.UUID;

public record CreateAccountResponse( UUID id,
                                     UUID customerId,
                                     String accountNumber){
}
