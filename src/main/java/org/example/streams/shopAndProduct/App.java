package org.example.streams.shopAndProduct;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Shop> shops = new ArrayList<>();

        // Создаем 10 магазинов
        for (int i = 1; i <= 10; i++) {
            Shop shop = new Shop("Магазин №" + i);

            // Добавляем по 7 продуктов в каждый магазин
            for (int j = 1; j <= 7; j++) {
                Product product = new Product(
                        "Товар " + j,
                        (Math.random() * 1000) + 50, // случайная цена от 50 до 1050
                        (int) (Math.random() * 100)  // случайное количество до 100
                );
                shop.addProduct(product);
            }

            shops.add(shop);
        }




        shops.forEach(System.out::println);

        List<Product> list = shops.stream()
                .flatMap(shop -> shop.getProducts().stream())
                .toList();


        list.stream().sorted((e1,e2)-> Double.compare(e1.getPrice(), e2.getPrice()))
                .forEach(System.out::println);

    }
}
