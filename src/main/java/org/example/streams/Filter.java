package org.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
//        double[] prices = {3.4, 5.6, 2.2, 1.5, 11.2};
//
//        List<Double> doubleList = Arrays.stream(prices)
//                .boxed()
//                .map(p -> p + (p * 0.5))
//                .toList();
//
//        System.out.println(doubleList);
//
//
//        List<Double> list = Arrays.stream(prices)
//                .filter(price -> {
//                    System.out.println();
//                    return price > 3.5;
//                })
//                .boxed()
//                .toList();


        List<String> namesList = new ArrayList<>();
        namesList.add("John");
        namesList.add("Jane");
        namesList.add("Bob");
        namesList.add("Mary");
        namesList.add("Jack");

        namesList.stream()
                .filter(name -> name.length() > 3)
                .peek(name -> System.out.println(name))
                .toList();







    }
}
