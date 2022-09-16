package com.IRONHACK.MidtermProject.model.account;

import com.IRONHACK.MidtermProject.constant.AccountType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@DiscriminatorValue(value = AccountType.STUDENT_CHECKING)
public class StudentChecking extends Checking {

}
