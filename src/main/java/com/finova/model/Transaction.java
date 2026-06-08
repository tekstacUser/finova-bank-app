package com.finova.model;

public class Transaction {

    private String transactionId;
    private Double amount;
    private String status;

    public Transaction(String transactionId,
                       Double amount,
                       String status) {

        this.transactionId = transactionId;
        this.amount = amount;
        this.status = status;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public Double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    
}