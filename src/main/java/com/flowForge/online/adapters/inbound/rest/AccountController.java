package com.flowforge.online.adapters.inbound.rest;

import com.flowforge.online.application.dto.request.CreateAccountRequest;
import com.flowforge.online.application.dto.response.CreateAccountResponse;
import com.flowforge.online.application.usecase.CreateAccountUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RequestMapping("/account")
@RestController
public class AccountController {

    private final CreateAccountUseCase createAccountUseCase;

    @PostMapping
    public ResponseEntity<CreateAccountResponse> createAccount(@RequestBody CreateAccountRequest request){
        CreateAccountResponse response = createAccountUseCase.createAccount(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
