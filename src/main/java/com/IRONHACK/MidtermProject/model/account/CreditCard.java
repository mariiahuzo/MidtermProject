package com.IRONHACK.MidtermProject.model.account;

import com.IRONHACK.MidtermProject.constant.AccountType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue(value = AccountType.CREDIT_CARD)
@SuperBuilder
public class CreditCard extends Account{

    @Max(value = 100000, message = "Credit limit can't be higher then 100000")
    @Column(precision = 6, scale = 2)
    @Builder.Default
    private BigDecimal creditLimit = BigDecimal.valueOf(100.00);
    @Column(precision = 6, scale = 2)
    @DecimalMin(value = "0.1", message = "Interest rate can't be lower then 0.1")
    @Builder.Default
    private BigDecimal interestRate = BigDecimal.valueOf(0.2);











}
