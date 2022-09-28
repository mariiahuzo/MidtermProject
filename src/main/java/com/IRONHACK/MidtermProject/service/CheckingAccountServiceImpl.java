package com.IRONHACK.MidtermProject.service;

import com.IRONHACK.MidtermProject.model.account.Account;
import com.IRONHACK.MidtermProject.model.account.Checking;
import com.IRONHACK.MidtermProject.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CheckingAccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;


    @Override
    public Account create(Account account) {
        return accountRepository.save((Checking)account);
    }

    @Override
    public Account update(Account account) {
        return accountRepository.save(account);
    }
}
