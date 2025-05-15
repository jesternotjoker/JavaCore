package org.example.hw.streams.hw8;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        /*
        Проитерируйся по потоку целых чисел, выведи каждый элемент в консоль при помощи peek(), затем собери все
        чётные числа в список с помощью filter() и toList().
         */
        List<Integer> listInt = new ArrayList<>();
        listInt.add(2);
        listInt.add(4);
        listInt.add(3);
        listInt.add(5);
        listInt.add(9);
        listInt.add(2);
        listInt.add(6);
        listInt.add(3);
        listInt.add(8);
        listInt.add(1);

        List<Integer> resultList = listInt.stream()
                .peek(n -> System.out.println(n))
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(resultList);
    }
}