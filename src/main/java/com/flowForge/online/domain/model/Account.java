package com.flowForge.online.domain.model;

import com.flowForge.online.domain.enums.AccountStatus;

import java.time.Instant;
import java.util.UUID;

public class Account {
    private UUID id;
    private UUID customerId;
    private String accountNumber;
    private AccountStatus status;
    private Instant createdAt;
}
