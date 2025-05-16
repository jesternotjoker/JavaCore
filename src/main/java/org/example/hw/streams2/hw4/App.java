package org.example.hw.streams2.hw4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        /*
        Подсчёт количества элементов в группах
        Есть список городов.
        Сгруппируйте города по стране и посчитайте, сколько городов в каждой стране. Результат: Map<Country, Long>.
         */
        List<String> cities = new ArrayList<>();
        cities.add("Москва");
        cities.add("Лондон");
        cities.add("Париж");
        cities.add("Санкт-Петербург");
        cities.add("Берлин");
        cities.add("Вашингтон");
        cities.add("Казань");
        cities.add("Ливерпуль");
        cities.add("Дрезден");

        Map<String, Long> collect = cities.stream()
                .collect(Collectors.groupingBy(App::getCountryByCity, Collectors.counting()));

        System.out.println(collect);
    }

    public static String getCountryByCity(String city) {
        return switch (city) {
            case "Москва", "Санкт-Петербург", "Казань" -> "РФ";
            case "Лондон", "Ливерпуль" -> "Великобритания";
            case "Вашингтон" -> "США";
            case "Берлин", "Дрезден" -> "Германия";
            case "Париж" -> "Франция";
            default -> "Неизвестно";
        };
    }
}