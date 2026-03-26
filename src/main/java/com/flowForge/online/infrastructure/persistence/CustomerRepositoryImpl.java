package com.flowforge.online.infrastructure.persistence;

import com.flowforge.online.domain.repository.ICustomerRepository;
import com.flowforge.online.infrastructure.persistence.repository.ICustomerJpaRepository;

import java.util.UUID;

public class CustomerRepositoryImpl implements ICustomerRepository {

    private final ICustomerJpaRepository repository;

    public CustomerRepositoryImpl(ICustomerJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean existsById(UUID uuid) {
        return repository.existsById(uuid);
    }
}
