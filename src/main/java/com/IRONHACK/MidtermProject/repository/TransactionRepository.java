package com.IRONHACK.MidtermProject.repository;

import com.IRONHACK.MidtermProject.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
