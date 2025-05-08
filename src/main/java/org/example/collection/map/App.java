package org.example.collection.map;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Milk", 2);
        map.put("Bread", 14);
        map.put("Cheese", 8);
        map.put("Pineapple", 12);

        Collection<Integer> values = map.values();
        Set<String> strings = map.keySet();

        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        List<String> cities = new ArrayList<>(Arrays.asList(
                "Москва", "Париж", "Нью-Йорк", "Токио", "Сидней",
                "Берлин", "Рим", "Дубай", "Санкт-Петербург", "Барселона",
                "Москва", "Париж", "Нью-Йорк", "Токио", "Сидней",
                "Берлин", "Рим", "Дубай", "Санкт-Петербург", "Барселона",
                "Москва", "Париж", "Нью-Йорк", "Токио", "Сидней",
                "Берлин", "Рим", "Дубай", "Санкт-Петербург", "Барселона",
                "Москва", "Париж", "Нью-Йорк", "Токио", "Сидней",
                "Берлин", "Рим", "Дубай", "Санкт-Петербург", "Барселона",
                "Москва", "Париж", "Нью-Йорк", "Токио", "Сидней",
                "Берлин", "Рим", "Дубай", "Санкт-Петербург", "Барселона","Дубай","Дубай","Дубай","Дубай"
        ));

        Map<String,Integer> cityMap = new TreeMap<>();
        for (String city : cities) {
            cityMap.put(city, cityMap.getOrDefault(city, 0) + 1);
        }



        List<Map.Entry<String, Integer>> list = new ArrayList<>(cityMap.entrySet());
        list.sort(Map.Entry.comparingByValue());


        System.out.println(list);






    }
}
