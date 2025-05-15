package org.example.hw.streams.hw7;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        /*
        Дан список объектов Product с полем price. Посчитай общую стоимость всех товаров с помощью mapToDouble()
        и sum().
         */
        List<Product> products = new ArrayList<>();
        products.add(new Product("Water", 35.2));
        products.add(new Product("Milk", 29.7));
        products.add(new Product("Soda", 20));
        products.add(new Product("Bread", 12.5));
        products.add(new Product("Chocolate", 37.4));
        products.add(new Product("Eggs", 25));
        products.add(new Product("Meat", 46.8));
        products.add(new Product("Cheese", 27.3));
        products.add(new Product("Potato", 12.2));
        products.add(new Product("Chips", 7));

        Double sumPrice = products.stream()
                .mapToDouble(p -> p.getPrice())
                .sum();

        System.out.println(sumPrice);
    }
}