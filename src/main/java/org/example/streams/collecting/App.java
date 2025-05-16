package org.example.streams.collecting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> listCompanies = new ArrayList<>();
        listCompanies.add("Microsoft");
        listCompanies.add("Apple");
        listCompanies.add("Google");
        listCompanies.add("Facebook");
        listCompanies.add("Twitter");
        listCompanies.add("Yahoo");
        listCompanies.add("Youtube");
        listCompanies.add("Google");
        listCompanies.add("Facebook");
        listCompanies.add("Twitter");

        Map<Integer, List<String>> collect = listCompanies.stream()
                .collect(Collectors.groupingBy(e -> e.length()));


        System.out.println(collect);

        Map<String, Long> collect1 = listCompanies.stream()
                .collect(Collectors.groupingBy(e->e, Collectors.counting()));


        System.out.println(collect1);


    }
}
