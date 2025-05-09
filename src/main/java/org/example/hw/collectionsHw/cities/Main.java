package org.example.hw.collectionsHw.cities;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        {
        /* 1. Сортировка городов
            Дан список городов. Отсортируйте их по населению в обратном порядке
            Объект город имеет свойства название и население
         */

            List<City> cities = new ArrayList<>();
            cities.add(new City("Москва", 13));
            cities.add(new City("Минск", 2));
            cities.add(new City("Рим", 3));
            cities.add(new City("Тест", 8));
            cities.add(new City("Нью-Йорк", 8));
            cities.add(new City("Берлин", 4));
            cities.add(new City("Стамбул", 16));

            cities.sort(Comparator
                    .comparing(City::getPopulation)
                    .thenComparing(City::getName)
                    .reversed()
            );

            System.out.println("Задание №1");
            cities.forEach(System.out::println);
            System.out.println();
        }


    }
}
