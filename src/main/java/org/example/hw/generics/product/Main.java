package org.example.hw.generics.product;

public class Main {
    public static void main(String[] args) {
        Product<Integer> product1 = new Product<Integer>("Iphone", 40000);
        Product<Long> product2 = new Product<Long>("Iphone", 40000L);
        Product<Double> product3 = new Product<Double>("Iphone", 40000.0);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
    }
}