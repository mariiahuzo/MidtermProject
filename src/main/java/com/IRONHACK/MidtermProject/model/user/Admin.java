package com.IRONHACK.MidtermProject.model.user;

import com.IRONHACK.MidtermProject.constant.UserType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
@DiscriminatorColumn(name = UserType.ADMIN)
public class Admin extends User {
 }
