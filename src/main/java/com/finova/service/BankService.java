package com.finova.service;

import com.finova.model.Account;
import com.finova.model.Customer;
import com.finova.model.Transaction;
import org.springframework.stereotype.Service;

@Service
public class BankService {

    public Customer getCustomer() {

        return new Customer(
                101L,
                "John Smith",
                "john@finova.com");
    }

    public Account getAccount() {

        return new Account(
                "ACC10001",
                "Savings",
                15000.00);
    }

    public Transaction getTransaction() {

        return new Transaction(
                "TXN90001",
                2500.00,
                "SUCCESS");
    }
}