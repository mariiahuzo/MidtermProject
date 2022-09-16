package com.IRONHACK.MidtermProject.model.address;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;

@Getter
@Setter
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class MailingAddress extends Address {

    private Integer postalCode;
    private String phone;
    private String email;
}
