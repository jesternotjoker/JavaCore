package org.example.hw.streams.hw4;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        /*
        Из списка целых чисел выбери только уникальные значения, пропусти первые два из них и собери оставшиеся
        в TreeSet с помощью distinct(), skip() и Collectors.toCollection().
         */
        List<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(0);
        listNumbers.add(3);
        listNumbers.add(0);
        listNumbers.add(2);
        listNumbers.add(4);
        listNumbers.add(8);
        listNumbers.add(1);
        listNumbers.add(4);
        listNumbers.add(2);
        listNumbers.add(7);

        TreeSet<Integer> treeSetNumbers = listNumbers.stream()
                .distinct()
                .skip(2)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(treeSetNumbers);
    }
}
