package org.example.streams.shopAndProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Shop {
    private String name;
    private List<Product> products;

    public Shop(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    // Метод для добавления продукта
    public void addProduct(Product product) {
        products.add(product);
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shop shop)) return false;
        return Objects.equals(name, shop.name) && Objects.equals(products, shop.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, products);
    }
}