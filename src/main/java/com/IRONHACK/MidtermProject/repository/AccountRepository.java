package com.IRONHACK.MidtermProject.repository;

import com.IRONHACK.MidtermProject.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
