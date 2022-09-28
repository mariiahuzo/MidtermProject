package com.IRONHACK.MidtermProject.controller;

import com.IRONHACK.MidtermProject.model.Transaction;
import com.IRONHACK.MidtermProject.model.account.Money;
import com.IRONHACK.MidtermProject.service.TransactionHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/transaction")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionHandler handler;

    @PostMapping("/accountIdFrom/{accountIdFrom}/accountIdTo/{accountIdTo}")
    public ResponseEntity<Transaction> withdraw(@PathVariable Long accountIdFrom, @PathVariable Long accountIdTo, @RequestBody Money amount) {

        return new ResponseEntity<>(
                handler.withdraw(accountIdFrom, accountIdTo, amount),
                HttpStatus.CREATED);

    }
}
