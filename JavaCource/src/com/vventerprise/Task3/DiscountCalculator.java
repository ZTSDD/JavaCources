package com.vventerprise.Task3;

import java.util.ArrayList;

public class DiscountCalculator {
    public static int calculateDiscount(ArrayList<CartProduct> products) {
        return products.size() > 5 ? 10 : 5;
    }
}
