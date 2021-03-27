package com.vventerprise.Task3;

import java.util.UUID;

public class Product {
    public UUID id;
    public String name;
    public double price;

    public Product() {

    }

    public Product(String name, double price) {
        id = UUID.randomUUID();
        this.name = name;
        this.price = price;
    }
}
