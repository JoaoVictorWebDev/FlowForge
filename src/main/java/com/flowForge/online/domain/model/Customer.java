package com.flowforge.online.domain.model;

import java.time.Instant;
import java.util.UUID;

import com.flowforge.online.domain.enums.CustomerStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Customer {

    private UUID id;

    private String name;

    private String email;

    private String documentNumber;

    private CustomerStatus status;

    private Instant createdAt;
}
