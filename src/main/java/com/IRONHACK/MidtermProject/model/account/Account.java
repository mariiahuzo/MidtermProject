package com.IRONHACK.MidtermProject.model.account;

import com.IRONHACK.MidtermProject.model.AccountStatus;
import com.IRONHACK.MidtermProject.model.user.AccountHolder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.javamoney.moneta.Money;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "accounts")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "account_type",
        discriminatorType = DiscriminatorType.STRING
)
@Embeddable
public class Account {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amount")
    private Money balance;

    @Enumerated(EnumType.STRING)
    private AccountStatus status;

    @Column(precision = 2, scale = 2)
    private BigDecimal penaltyFee = BigDecimal.valueOf(40.00);

    @ManyToOne
    @JoinColumn(name = "account_holder_id")
    private AccountHolder accountHolder;

    @CreationTimestamp
    private Instant createdAt;

}
