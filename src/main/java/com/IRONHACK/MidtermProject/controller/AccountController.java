package com.IRONHACK.MidtermProject.controller;

import com.IRONHACK.MidtermProject.dto.AccountDto;
import com.IRONHACK.MidtermProject.dto.Type;
import com.IRONHACK.MidtermProject.model.account.Account;
import com.IRONHACK.MidtermProject.service.AccountHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/account")
public class AccountController {

    private final AccountHandler accountHandler;

    @GetMapping("/{id}")
    public ResponseEntity<Account> get(@PathVariable Long id) {
        return new ResponseEntity<>(
                accountHandler.get(id),
                HttpStatus.OK);

    }

    @PostMapping("/create/{type}")
    public ResponseEntity<Account> create(@PathVariable Type type, @Valid @RequestBody AccountDto account) {
        return new ResponseEntity<>(
                accountHandler.create(account, type),
                HttpStatus.CREATED
        );

    }

    @PutMapping("/update/{type}/{id}")
    public ResponseEntity<Account> update(@PathVariable Type type, @PathVariable Long id, @Valid @RequestBody AccountDto account) {
        return new ResponseEntity<>(
                accountHandler.update(account, type, id),
                HttpStatus.OK
        );

    }

}
