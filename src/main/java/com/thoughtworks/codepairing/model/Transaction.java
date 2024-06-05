package com.thoughtworks.codepairing.model;

import java.util.Arrays;

public class Transaction {
    private String[] gifts;

    public Transaction(String[] gifts) {
        this.gifts = gifts;
    }

    @Override
    public String toString() {
        return gifts.length + " gifts: " + Arrays.toString(gifts);
    }
}
