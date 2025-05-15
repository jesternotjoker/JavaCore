package org.example.hw.streams.hw10;

import java.util.ArrayDeque;
import java.util.Queue;

public class App {
    public static void main(String[] args) {
        /*
        Создай поток целых чисел от 1 до 100. Найди максимальное число, которое делится на 3, используя filter() и max().
         */
        Queue<Integer> numbers = new ArrayDeque<>();
        numbers.add(1);
        numbers.add(45);
        numbers.add(21);
        numbers.add(37);
        numbers.add(11);
        numbers.add(5);
        numbers.add(79);
        numbers.add(21);
        numbers.add(69);
        numbers.add(77);
        numbers.add(13);

        System.out.println(numbers.stream()
                .filter(n -> n % 3 == 0)
                .mapToInt(Integer::intValue)
                .max());

    }
}
