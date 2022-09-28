package com.IRONHACK.MidtermProject.mapper;

import com.IRONHACK.MidtermProject.dto.AccountDto;
import com.IRONHACK.MidtermProject.dto.Type;
import com.IRONHACK.MidtermProject.model.account.Account;
import com.IRONHACK.MidtermProject.model.account.Checking;
import com.IRONHACK.MidtermProject.model.account.Money;
import lombok.experimental.UtilityClass;

import java.util.Currency;

@UtilityClass
public class AccountMapper {

    // TODO map me correctly
    public static Account toModel(AccountDto dto, Type type) {
        return switch (type) {
            case STUDENT_CHECKING,
                    CHECKING -> checkingAccount(dto);
            case SAVINGS -> savingsAccount(dto);
            case CREDIT_CARD -> creditCardAccount(dto);
        };
    }

    private static Account creditCardAccount(AccountDto dto) {
        return null;
    }

    private static Account savingsAccount(AccountDto dto) {
        return null;

    }

    private static Account checkingAccount(AccountDto dto) {
        return Checking.builder()
                .balance(new Money(
                                dto.getBalance(),
                                Currency.getInstance(dto.getCurrency())
                        )
                )
                .penaltyFee(dto.getPenaltyFee())
                .status(dto.getStatus())
                .secretKey(dto.getSecretKey())
                .minimumBalance(dto.getMinimumBalance())
                //.monthlyMaintenanceFee(dto.getMonthlyMaintenanceFee())
                .build();
    }
}
