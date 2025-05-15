package org.example.hw.streams.hw1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        /*
        Дан список целых чисел. Найди сумму всех положительных чисел, используя stream(), filter() и sum().
         */
        List<Integer> numbers = new ArrayList<>();
        // [0, 5, 10, -2, 2, -1, -4, 3, -5, 3, -10, 7, -4, -4, -10]
        numbers.add(0);
        numbers.add(5);
        numbers.add(10);
        numbers.add(-2);
        numbers.add(2);
        numbers.add(-1);
        numbers.add(-4);
        numbers.add(3);
        numbers.add(-5);
        numbers.add(3);
        numbers.add(-10);
        numbers.add(7);
        numbers.add(-4);
        numbers.add(-4);
        numbers.add(-10);

        Integer result = numbers.stream()
                .filter(n -> n > 0)
                .mapToInt(Integer::intValue)
                .sum();


        System.out.println(result);
    }
}