package com.IRONHACK.MidtermProject.service;

import com.IRONHACK.MidtermProject.model.account.Account;
import com.IRONHACK.MidtermProject.model.account.CreditCard;
import com.IRONHACK.MidtermProject.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreditAccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    @Override
    public Account create(Account account) {
        return accountRepository.save((CreditCard) account);
    }

    @Override
    public Account update(Account account) {
        return accountRepository.save(account);
    }
}
