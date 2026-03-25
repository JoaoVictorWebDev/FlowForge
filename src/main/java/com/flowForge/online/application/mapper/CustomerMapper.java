package com.flowforge.online.application.mapper;

import com.flowforge.online.domain.model.Customer;
import com.flowforge.online.infrastructure.persistence.AccountEntity;
import com.flowforge.online.infrastructure.persistence.CustomerEntity;

public class CustomerMapper {

    public static CustomerEntity toEntity(Customer domain){

        CustomerEntity csEntity = new CustomerEntity();
        csEntity.setId(domain.getId());
        csEntity.setName(domain.getName());
        csEntity.setEmail(domain.getEmail());
        csEntity.setStatus(domain.getStatus());
        csEntity.setCreatedAt(domain.getCreatedAt());
        return csEntity;
    }

    public static Customer toDomain(CustomerEntity entity){

        return new Customer(
                entity.getId(),
                entity.getEmail(),
                entity.getName(),
                entity.getDocumentNumber(),
                entity.getStatus(),
                entity.getCreatedAt()
        );
    }
}
