package com.flowforge.online.domain.repository;

import java.util.UUID;

public interface ICustomerRepository {

    public boolean existsById(UUID uuid);

}
