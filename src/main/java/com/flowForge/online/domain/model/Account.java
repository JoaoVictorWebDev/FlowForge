package com.flowforge.online.domain.model;

import java.time.Instant;
import java.util.UUID;

import com.flowforge.online.domain.enums.AccountStatus;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
public class Account {

    private UUID id;

    private UUID customerId;

    private String accountNumber;

    private AccountStatus status;

    private Instant createdAt;

}
