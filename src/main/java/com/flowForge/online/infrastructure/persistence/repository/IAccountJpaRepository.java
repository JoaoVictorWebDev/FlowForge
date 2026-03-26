package com.flowforge.online.infrastructure.persistence.repository;

import com.flowforge.online.infrastructure.persistence.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IAccountJpaRepository extends JpaRepository<AccountEntity, UUID> {

}
