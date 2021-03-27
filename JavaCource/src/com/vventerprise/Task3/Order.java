package com.vventerprise.Task3;

import java.util.ArrayList;
import java.util.UUID;

public class Order {
    public UUID id;
    public ArrayList<CartProduct> userCart;
    public Bill bill;

    public  Order(){

    }

    public Order(ArrayList<CartProduct> userCart, Bill bill) {
        id = UUID.randomUUID();
        this.userCart = userCart;
        this.bill = bill;
    }
}
