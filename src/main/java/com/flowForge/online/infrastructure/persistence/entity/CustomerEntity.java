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

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "document_number")
    private String documentNumber;

    @Enumerated(EnumType.STRING)
    private CustomerStatus status;

    @Transient
    private Instant createdAt;
}
