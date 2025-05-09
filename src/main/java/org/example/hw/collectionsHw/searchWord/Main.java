package org.example.hw.collectionsHw.searchWord;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        Дан список строк (List<String>).
        Найдите строку, которая встречается чаще всего. Если таких строк несколько — верните любую.
        Используйте Map<String, Integer> для подсчёта.
         */
        List<String> strings = new ArrayList<>();
        strings.add("Red");
        strings.add("Black");
        strings.add("Green");
        strings.add("Blue");
        strings.add("Red");
        strings.add("Brown");
        strings.add("Purple");
        strings.add("Red");
        strings.add("Black");
        strings.add("White");
        strings.add("Green");
        strings.add("Black");

        Map<String,Integer> elementsMap = new HashMap<>();
        for (String element : strings) {
            elementsMap.put(element, elementsMap.getOrDefault(element, 0) + 1);
        }
        Integer max = Collections.max(elementsMap.values());

        for (Map.Entry<String, Integer> entry : elementsMap.entrySet()){
            if (entry.getValue().equals(max)) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
