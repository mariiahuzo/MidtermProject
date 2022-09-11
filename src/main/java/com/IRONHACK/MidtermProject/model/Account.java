package com.IRONHACK.MidtermProject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 3)
    private String currency;
    private String secretKey;
    @Enumerated(EnumType.STRING)
    private AccountType accountType;
    @Enumerated(EnumType.STRING)
    private AccountStatus status;
    @Column(precision = 8, scale = 2)
    private BigDecimal balance;
    @Column(precision = 8, scale = 2)
    private BigDecimal minimumBalance;
    @Column(precision = 8, scale = 2)
    private BigDecimal penaltyFee;
    @Column(precision = 8, scale = 2)
    private BigDecimal monthlyMaintenanceFee;
    @Column(precision = 8, scale = 2)
    private BigDecimal interestRate;
    @Column(precision = 8, scale = 2)
    private BigDecimal creditLimit;
    private Instant creationDate;

    @OneToMany(mappedBy = "account")
    private Set<User> users;

}
