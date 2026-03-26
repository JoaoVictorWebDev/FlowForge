package com.flowforge.online.application.mapper;

import com.flowforge.online.domain.model.Account;
import com.flowforge.online.infrastructure.persistence.entity.AccountEntity;

public class AccountMapper {

    public static AccountEntity toEntity(Account domain) {
        AccountEntity e = new AccountEntity();
        e.setId(domain.getId());
        e.setCustomerId(domain.getCustomerId());
        e.setAccountNumber(domain.getAccountNumber());
        e.setStatus(domain.getStatus());
        e.setCreatedAt(domain.getCreatedAt());
        return e;
    }

    public static Account toDomain(AccountEntity entity) {
        return new Account(
                entity.getId(),
                entity.getCustomerId(),
                entity.getAccountNumber(),
                entity.getStatus(),
                entity.getCreatedAt()
        );
    }
}
