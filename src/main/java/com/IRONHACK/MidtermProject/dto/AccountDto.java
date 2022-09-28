package com.IRONHACK.MidtermProject.dto;

import com.IRONHACK.MidtermProject.model.AccountStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto {
    private Long id;
    private String currency;
    private BigDecimal balance;
    private AccountStatus status;
    private BigDecimal penaltyFee;
    private Long accountHolderId;
    private BigDecimal minimumBalance;
    private BigDecimal monthlyMaintenanceFee;
    private BigDecimal creditLimit;
    private BigDecimal interestRate;

    private String secretKey;

}
