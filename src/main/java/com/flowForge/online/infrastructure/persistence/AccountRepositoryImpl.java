package com.flowforge.online.infrastructure.persistence;

import com.flowforge.online.application.mapper.AccountMapper;
import com.flowforge.online.domain.model.Account;
import com.flowforge.online.domain.repository.IAccountRepository;
import com.flowforge.online.infrastructure.persistence.entity.AccountEntity;
import com.flowforge.online.infrastructure.persistence.repository.IAccountJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class AccountRepositoryImpl  implements IAccountRepository {

    private final IAccountJpaRepository repository;

    public AccountRepositoryImpl(IAccountJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Account save(Account account) {
        return AccountMapper.toDomain(
                repository.save(AccountMapper.toEntity(account))
        );
    }

    @Override
    public boolean existsById(UUID uuid) {
        return repository.existsById(uuid);
    }

    @Override
    public Optional<Account> findById(UUID uuid) {

        return repository.findById(uuid).map(AccountMapper::toDomain);
    }

    @Override
    public List<Account> findAll() {

        return repository.findAll().stream().map(AccountMapper::toDomain).toList();
    }

    @Override
    public void deleteById(UUID uuid) {
        repository.deleteById(uuid);
    }
}
