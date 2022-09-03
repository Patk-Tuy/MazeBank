package com.jmc.mazebank.Models;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class CheckingAccount extends Account {
    // The number of transactions a client is allowed to do per day.
    private final IntegerProperty transactionLimit;

    public CheckingAccount(String owner, String accountNumber, double balance, int tLimit) {
        super(owner, accountNumber, balance);
        this.transactionLimit = new SimpleIntegerProperty(this, "Transaction Limit", tLimit);
    }

    public IntegerProperty transactionLimitProp() {return transactionLimit;}

    @Override
    public String toString() {
        return accountNumberProperty().get();
    }
}
