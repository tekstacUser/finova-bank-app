package com.finova.model;

public class Account {

    private String accountNumber;
    private String accountType;
    private Double balance;

    public Account(String accountNumber,
                   String accountType,
                   Double balance) {

        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public Double getBalance() {
        return balance;
    }

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
    
}