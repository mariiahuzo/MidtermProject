package com.IRONHACK.MidtermProject.service;


import com.IRONHACK.MidtermProject.dto.Type;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AccountServiceFactory {

    private final CheckingAccountServiceImpl checkingAccountService;
    private final SavingsAccountServiceImpl savingsAccountService;
    private final CreditAccountServiceImpl creditAccountService;


    public AccountService get(Type type) {

        return switch (type) {
            case STUDENT_CHECKING,
                    CHECKING -> checkingAccountService;
            case SAVINGS -> savingsAccountService;
            case CREDIT_CARD -> creditAccountService;
        };
    }
}
