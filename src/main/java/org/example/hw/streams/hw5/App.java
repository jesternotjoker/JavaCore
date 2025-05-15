package org.example.hw.streams.hw5;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        /*
        Объедини два потока целых чисел в один, выведи первые 5 элементов и посчитай их среднее значение.
        Используй Stream.concat(), limit(), mapToDouble() и average().
         */
        Queue<Integer> numbers1 = new ArrayDeque<>();
        numbers1.add(2);
        numbers1.add(9);
        numbers1.add(-3);
        numbers1.add(-2);
        numbers1.add(4);
        Queue<Integer> numbers2 = new ArrayDeque<>();
        numbers2.add(5);
        numbers2.add(-6);
        numbers2.add(8);
        numbers2.add(-9);
        numbers2.add(2);


        var avg = Stream.concat(numbers1.stream(), numbers2.stream())
                .limit(5)
                .mapToDouble(i -> i)
                .average()//;
                .getAsDouble();

        System.out.println(avg);
    }
}