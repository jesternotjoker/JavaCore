package org.example.hw.collectionsHw.iteratorUniqueNumbers;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        3. Удаление дубликатов с помощью итератора
        Дан список целых чисел (List<Integer>), содержащий дубликаты.
        Напишите метод, который удаляет все дубликаты на месте , используя Iterator.
         */
        List<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(1);
        listNumbers.add(3);
        listNumbers.add(1);
        listNumbers.add(3);
        listNumbers.add(1);
        listNumbers.add(5);
        listNumbers.add(3);
        listNumbers.add(5);
        listNumbers.add(8);
        listNumbers.add(1);
        listNumbers.add(4);

        ListIterator<Integer> iteratorNumbers = listNumbers.listIterator();

        while (iteratorNumbers.hasNext()) {
            Integer number = iteratorNumbers.next();
            Integer count = Collections.frequency(listNumbers, number);
            if (count > 1) iteratorNumbers.remove();
        }

        System.out.println(listNumbers);
    }
}
