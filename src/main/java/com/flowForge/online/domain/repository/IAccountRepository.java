package com.flowforge.online.domain.repository;

import com.flowforge.online.domain.model.Account;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IAccountRepository {

    public Account save(Account account);

    public boolean existsById(UUID uuid);

    public Optional<Account> findById(UUID uuid);

    public List<Account> findAll();

    public void deleteById(UUID uuid);
}
