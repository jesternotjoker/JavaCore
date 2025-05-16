package org.example.hw.streams2.hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        /*
        Группировка по длине строки
        У вас есть список строк.
        Сгруппируйте их по длине: ключ — длина строки, значение — список строк этой длины.
         */
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("Something");
        strings.add("Everybody");
        strings.add("Six");
        strings.add("Add");
        strings.add("Freedom");
        strings.add("Country");
        strings.add("City");
        strings.add("Of");

        Map<Integer, List<String>> collect = strings.stream()
                .collect(Collectors.groupingBy(e -> e.length()));

        System.out.println(collect);
    }
}