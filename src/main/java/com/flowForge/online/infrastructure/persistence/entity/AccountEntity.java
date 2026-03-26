package com.flowforge.online.infrastructure.persistence.entity;

import com.flowforge.online.domain.enums.AccountStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Table(name = "account")
@Entity
@Getter
@Setter
public class AccountEntity {

    @Id
    private UUID id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private UUID customerId;

    @Column(name="account_number")
    private String accountNumber;

    @Enumerated(EnumType.STRING)
    private AccountStatus status;

    @Transient
    private Instant createdAt;
}
