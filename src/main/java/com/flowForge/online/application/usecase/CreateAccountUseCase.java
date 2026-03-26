package com.flowforge.online.application.usecase;

import com.flowforge.online.adapters.inbound.mapper.AccountRequestMapper;
import com.flowforge.online.application.dto.request.CreateAccountRequest;
import com.flowforge.online.application.dto.response.CreateAccountResponse;
import com.flowforge.online.domain.exception.CustomerNotFoundException;
import com.flowforge.online.domain.model.Account;
import com.flowforge.online.domain.repository.IAccountRepository;
import com.flowforge.online.domain.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateAccountUseCase {

    @Autowired
    private IAccountRepository accountRepository;

    @Autowired
    private ICustomerRepository customerRepository;

    public CreateAccountResponse createAccount(CreateAccountRequest dto) {
        Account account = AccountRequestMapper.toDomain(dto);

        if (!customerRepository.existsById(account.getCustomerId()))

            throw new CustomerNotFoundException("Client with this id not exists " + account.getCustomerId());

        accountRepository.save(account);
        return AccountRequestMapper.toResponse(account);
    }
}