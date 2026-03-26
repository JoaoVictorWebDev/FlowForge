package com.flowforge.online.infrastructure.persistence.entity;

import com.flowforge.online.domain.enums.CustomerStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Table(name = "customer")
@Entity
@Getter
@Setter
public class CustomerEntity {

    @Id
    private UUID id;

    private String name;

    private String email;

    private String documentNumber;

    @Enumerated(EnumType.STRING)
    private CustomerStatus status;

    @OneToOne(mappedBy = "customer", fetch = FetchType.LAZY)
    private AccountEntity account;

    private Instant createdAt;
}
