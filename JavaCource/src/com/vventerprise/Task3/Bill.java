package com.vventerprise.Task3;

import java.util.UUID;

public class Bill {
    public UUID id;
    public double amount;
    public int discount;

    public  Bill() {
    }

    public Bill(double amount, int discount){
        id = UUID.randomUUID();
        this.amount = amount;
        this.discount = discount;
    }
}
