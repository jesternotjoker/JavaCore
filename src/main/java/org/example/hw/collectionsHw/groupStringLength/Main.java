package org.example.hw.collectionsHw.groupStringLength;

import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        /*
        Дан список строк.
        Сгруппируйте строки по их длине: для каждой длины создайте список соответствующих строк.
        Результат должен иметь тип Map<Integer, List<String>>.
         */

        List<String> strings = new ArrayList<>();
        strings.add("street");
        strings.add("city");
        strings.add("apple");
        strings.add("home");
        strings.add("almost");
        strings.add("and");
        strings.add("dark");
        strings.add("or");
        strings.add("alien");

        Map<Integer, List<String>> mapWords = new TreeMap<>();
        for(String word : strings){
            List<String> words = !(mapWords.containsKey(word.length()))
                    ? new ArrayList<>() : mapWords.get(word.length());
            words.add(word);
            mapWords.put(word.length(), words);
        }
        System.out.println(mapWords);
    }
}
