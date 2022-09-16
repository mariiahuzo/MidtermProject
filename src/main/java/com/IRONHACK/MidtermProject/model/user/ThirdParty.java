package com.IRONHACK.MidtermProject.model.user;

import com.IRONHACK.MidtermProject.constant.UserType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorColumn(name = UserType.THIRD_PARTY)
public class ThirdParty extends User {

    @Column(name = "hashed_key")
    private String key;
}
