package com.IRONHACK.MidtermProject.model.account;

import com.IRONHACK.MidtermProject.constant.AccountType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue(value = AccountType.SAVINGS)
@SuperBuilder
public class Savings extends Account {

    @NotNull
    private String secretKey;

    @Column(precision = 2, scale = 4)
    @DecimalMax(value = "0.5", message = "Interest rate can't be higher then 0.5")
    @Builder.Default
    private BigDecimal interestRate = BigDecimal.valueOf(0.0025);

    @Column(precision = 8, scale = 2)
    @Min(value = 100, message = "Minimum balance can't be lower then 100")
    @Builder.Default
    private BigDecimal minimumBalance = BigDecimal.valueOf(1000);

}
