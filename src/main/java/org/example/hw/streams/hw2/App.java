package org.example.hw.streams.hw2;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        /*
        Есть список строк. Преобразуй каждую строку в длину этой строки, отсортируй длины по возрастанию и собери их в
        список. Используй map(), sorted(), toList().
         */
        List<String> words = new ArrayList<>();
        words.add("on");
        words.add("brutal");
        words.add("appetite");
        words.add("for");
        words.add("density");
        words.add("figure");
        words.add("a");
        words.add("onetime");
        words.add("the");
        words.add("thunder");

        List<Integer> newWords = words.stream()
                .map(w -> w.length())
                .sorted()
                .toList();

        System.out.println(newWords);
    }
}