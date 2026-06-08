package com.finova.controller;

import com.finova.model.Account;
import com.finova.model.Customer;
import com.finova.model.Transaction;
import com.finova.service.BankService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    private final BankService bankService;

    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    @GetMapping("/")
    public String home() {
        return "FinovaBank Payments Service Running";
    }

    @GetMapping("/customer")
    public Customer customer() {
        return bankService.getCustomer();
    }

    @GetMapping("/account")
    public Account account() {
        return bankService.getAccount();
    }

    @GetMapping("/transaction")
    public Transaction transaction() {
        return bankService.getTransaction();
    }
}