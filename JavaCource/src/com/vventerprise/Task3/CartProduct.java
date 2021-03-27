package com.vventerprise.Task3;

import java.util.UUID;

public class CartProduct {
    public UUID id;
    public Product product;
    public int count;

    public CartProduct() {

    }

    public CartProduct(Product product, int count) {
        id = UUID.randomUUID();
        this.product = product;
        this.count = count;
    }
}
