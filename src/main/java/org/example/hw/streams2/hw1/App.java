package org.example.hw.streams2.hw1;

import org.example.hw.streams2.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        /*
        Группировка по категориям
        У вас есть список продуктов (List<Product>), у каждого продукта есть поле category.
        Сгруппируйте продукты по категориям, чтобы на выходе был Map<String, List<Product>>.
         */

        List<Product> products = new ArrayList<>();
        products.add(new Product("Сникерс", "Шоколадный батончик"));
        products.add(new Product("Lays", "Чипсы"));
        products.add(new Product("Марс", "Шоколадный батончик"));
        products.add(new Product("Pringles", "Чипсы"));
        products.add(new Product("Бон Аква", "Питьевая вода"));
        products.add(new Product("Яблоки", "Фрукты"));
        products.add(new Product("Баунти", "Шоколадный батончик"));
        products.add(new Product("Картофель", "Овощи"));
        products.add(new Product("Груши", "Фрукты"));

        Map<String, List<Product>> collect = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        for (Map.Entry<String, List<Product>> entry : collect.entrySet()) {
            System.out.println(entry.getKey() + ":\n" + entry.getValue());
        }

    }
}
