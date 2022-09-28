package com.IRONHACK.MidtermProject.model.account;

import com.IRONHACK.MidtermProject.model.AccountStatus;
import com.IRONHACK.MidtermProject.model.user.AccountHolder;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;
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
@SuperBuilder(toBuilder = true)
public class Account {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amount")
    @Embedded
    private Money balance;

    @Enumerated(EnumType.STRING)
    @Builder.Default
    private AccountStatus status = AccountStatus.CREATED;

    @Column(precision = 2, scale = 2)
    @Builder.Default
    private BigDecimal penaltyFee = BigDecimal.valueOf(40.00);

    @ManyToOne
    @JoinColumn(name = "account_holder_id")
    private AccountHolder accountHolder;

    @CreationTimestamp
    private Instant createdAt = Instant.now();

}
