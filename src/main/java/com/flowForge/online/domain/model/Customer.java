package com.flowForge.online.domain.model;

import com.flowForge.online.domain.enums.CustomerStatus;

import java.time.Instant;
import java.util.UUID;

public class Customer {
    private UUID id;
    private String name;
    private String email;
    private String documentNumber;
    private CustomerStatus status;
    private Instant createdAt;
}
