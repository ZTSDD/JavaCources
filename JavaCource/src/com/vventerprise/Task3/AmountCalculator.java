package com.vventerprise.Task3;

import java.util.ArrayList;
import java.util.Optional;

public class AmountCalculator {
    public static double calculateAmount(ArrayList<CartProduct> userCart, int discount) {
        Optional<Double> result = userCart.stream()
                .map(cartProduct -> cartProduct.product.price * cartProduct.count)
                .reduce((prev, current) -> prev + current);
        return  result.get() * (100 - discount) / 100;
    }
}
