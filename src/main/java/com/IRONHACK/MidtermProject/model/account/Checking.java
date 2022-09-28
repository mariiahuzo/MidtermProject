package com.IRONHACK.MidtermProject.model.account;

import com.IRONHACK.MidtermProject.constant.AccountType;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.boot.context.properties.bind.DefaultValue;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.Min;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue(value = AccountType.CHECKING)
@SuperBuilder(toBuilder = true)
public class Checking extends Account {

    private String secretKey;

    @Column(precision = 8, scale = 2)
    @Min(value = 250, message = "Minimum balance can't be less then 250")
    @Builder.Default
    private BigDecimal minimumBalance = BigDecimal.valueOf(250.00);

    @Column(precision = 8, scale = 2)
    @Builder.Default
    private BigDecimal monthlyMaintenanceFee = BigDecimal.valueOf(12.00);

}
