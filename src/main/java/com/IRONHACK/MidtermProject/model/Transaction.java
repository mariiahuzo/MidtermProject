package com.IRONHACK.MidtermProject.model;

import com.IRONHACK.MidtermProject.model.account.Account;
import com.IRONHACK.MidtermProject.model.account.Money;
import lombok.*;

import javax.persistence.*;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "transactions")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    @Builder.Default
    private TransactionStatus status = TransactionStatus.CREATED;
    private Money amount;
    @Embedded
    @ManyToOne
    private Account accountFrom;
    @Embedded
    @ManyToOne
    private Account accountTo;
    @Builder.Default
    private Instant createdAt = Instant.now();
    private Instant updatedAt;

}
