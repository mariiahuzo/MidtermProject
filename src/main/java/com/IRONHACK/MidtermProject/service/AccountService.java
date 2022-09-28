package com.IRONHACK.MidtermProject.service;

import com.IRONHACK.MidtermProject.model.account.Account;

public interface AccountService {

    Account create(Account account);

    Account update(Account toModel);

}
