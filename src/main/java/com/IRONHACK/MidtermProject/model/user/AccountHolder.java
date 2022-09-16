package com.IRONHACK.MidtermProject.model.user;


import com.IRONHACK.MidtermProject.constant.UserType;
import com.IRONHACK.MidtermProject.model.account.Account;
import com.IRONHACK.MidtermProject.model.address.Address;
import com.IRONHACK.MidtermProject.model.address.MailingAddress;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorColumn(name = UserType.ACCOUNT_HOLDER)
public class AccountHolder extends User {

    @Column(nullable = false)
    @DateTimeFormat(pattern = "yyyy/mm/dd")
    private LocalDate dataBirth;
    @Embedded
    @Column(nullable = false)
    private Address primaryAddress;
    @Embedded
    private MailingAddress mailingAddress;

    @OneToMany(mappedBy = "accountHolder", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Account> accounts;

}
