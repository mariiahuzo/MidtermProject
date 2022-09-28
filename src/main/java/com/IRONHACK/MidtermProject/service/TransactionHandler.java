package com.IRONHACK.MidtermProject.service;

import com.IRONHACK.MidtermProject.exception.ModelNotFoundException;
import com.IRONHACK.MidtermProject.model.Transaction;
import com.IRONHACK.MidtermProject.model.account.Account;
import com.IRONHACK.MidtermProject.model.account.Money;
import com.IRONHACK.MidtermProject.repository.AccountRepository;
import com.IRONHACK.MidtermProject.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TransactionHandler {
    private final AccountRepository repository;

    private final TransactionRepository transactionRepository;

    public Transaction withdraw(Long accountIdFrom, Long accountIdTo, Money amount) {

        var accountFrom = repository.findById(accountIdFrom)
                .orElseThrow(() -> new ModelNotFoundException(Account.class, accountIdFrom));

        var accountTo = repository.findById(accountIdTo)
                .orElseThrow(() -> new ModelNotFoundException(Account.class, accountIdTo));


        var transaction = Transaction.builder()
                .accountFrom(accountFrom)
                .accountTo(accountTo)
                .amount(amount)
                .build();

        return transactionRepository.save(transaction);

    }

}
