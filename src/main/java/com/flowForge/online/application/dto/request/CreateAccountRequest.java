package com.flowforge.online.application.dto.request;

import java.util.UUID;

public record CreateAccountRequest(
        UUID customerId,
        String accountNumber){
}
