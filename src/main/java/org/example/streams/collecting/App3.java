package org.example.streams.collecting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App3 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Анна");
        names.add("Диана");
        names.add("Антон");
        names.add("Андрей");
        names.add("Даниил");
        names.add("Егор");

        Map<Character, String> collect = names.stream()
                .collect(Collectors.groupingBy(e -> e.charAt(0), Collectors.joining(", ")));
        System.out.println(collect);

        String collect1 = names.stream()
                .collect(Collectors.joining(", ","NUMS: ","."));
        System.out.println(collect1);



    }



}
