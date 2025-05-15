package org.example.hw.streams.hw9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        /*
        Есть список строк. Пропусти первые три элемента, остальные преобразуй в верхний регистр, отсортируй
        и собери в LinkedList. Используй skip(), map(), sorted(), Collectors.toCollection().
         */
        List<String> listString = new ArrayList<>();
        listString.add("Hello");
        listString.add("Something");
        listString.add("Stream");
        listString.add("Start");
        listString.add("Last");
        listString.add("Summer");
        listString.add("Scream");

        LinkedList<String> linkedList = listString.stream()
                .skip(3)
                .map(s -> s.toUpperCase())
                .sorted()
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(linkedList);
    }
}