package com.flowforge.online.infrastructure.persistence.repository;

import com.flowforge.online.infrastructure.persistence.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface ICustomerJpaRepository extends JpaRepository<CustomerEntity, UUID> {

}
