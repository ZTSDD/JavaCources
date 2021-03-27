package com.vventerprise.Task3;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        // Инициализация корзины
        ArrayList<CartProduct> userCart = new ArrayList<CartProduct>() {{
            add(new CartProduct(new Product("Процессор i5", 12800), 1));
            add(new CartProduct(new Product("Материнская плата под i5", 6400), 1));
            add(new CartProduct(new Product("ОЗУ 8 гб", 2500), 4));
            add(new CartProduct(new Product("Жесткий диск", 6400), 2));
            add(new CartProduct(new Product("SSD", 9600), 1));
            add(new CartProduct(new Product("Клавиатура", 1200), 1));
            add(new CartProduct(new Product("Мышь", 1800), 1));
            add(new CartProduct(new Product("Наушники", 3200), 1));
            add(new CartProduct(new Product("Принтер", 4200), 1));
            add(new CartProduct(new Product("Монитор", 16800), 1));
        }};

        // Вычисление скидки, суммы. Создание чека и заказа
        int discount = DiscountCalculator.calculateDiscount(userCart);
        double amount = AmountCalculator.calculateAmount(userCart, discount);
        Bill bill = new Bill(amount, discount);
        Order order = new Order(userCart, bill);

        // Сериализация заказа
        OrderSerializer orderSerializer = new OrderSerializer();
        String serializedData = orderSerializer.serialize(order);

        // Сохранение в файл
        FileUtility fileUtility = new FileUtility();
        long currentDate = new Date(System.currentTimeMillis()).getTime();
        DateFormat df = new SimpleDateFormat("MMddyyyyHHmmss");
        String fileName = "D:\\" + df.format(new Date(System.currentTimeMillis())) + ".txt";
        fileUtility.saveToFile(fileName, serializedData);

        // Чтение из файла
        String fileData = fileUtility.readFromFile(fileName);
        Order deserializedOrder = orderSerializer.deserialize(fileData);
    }
}
