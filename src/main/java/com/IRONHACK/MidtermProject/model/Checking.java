package com.IRONHACK.MidtermProject.model;

import com.IRONHACK.MidtermProject.enums.CheckingStatus;

import javax.persistence.*;
import java.util.Date;
import java.util.Optional;


@Entity
@Table
public class Checking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long balance;
    private String secretKey;
    private String PrimaryOwner;
    private Optional SecondaryOwner;
    private Long minimumBalance;
    private Long penaltyFee;
    private Long monthlyMaintenanceFee;
    private Date creationDate;
    @Enumerated(EnumType.STRING)
    private CheckingStatus status;

    public Checking() {
    }
}
