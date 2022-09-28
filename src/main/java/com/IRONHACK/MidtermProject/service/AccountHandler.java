package com.IRONHACK.MidtermProject.service;

import com.IRONHACK.MidtermProject.exception.ModelNotFoundException;
import com.IRONHACK.MidtermProject.mapper.AccountMapper;
import com.IRONHACK.MidtermProject.dto.AccountDto;
import com.IRONHACK.MidtermProject.dto.Type;
import com.IRONHACK.MidtermProject.model.account.Account;
import com.IRONHACK.MidtermProject.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AccountHandler {
    private final AccountServiceFactory accountServiceFactory;
    private final AccountRepository repository;

    public Account create(AccountDto account, Type type) {
        return accountServiceFactory
                .get(type)
                .create(AccountMapper.toModel(account, type));
    }

    public Account get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ModelNotFoundException(Account.class, id));
    }

    public Account update(AccountDto account, Type type, Long id) {
        var saved = repository.findById(id)
                .orElseThrow(() -> new ModelNotFoundException(Account.class, id));

        return accountServiceFactory.get(type)
                .update(AccountMapper.toModel(account, type));

    }
}
