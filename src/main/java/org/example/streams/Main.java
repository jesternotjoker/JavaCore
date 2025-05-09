package org.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Mary");
        names.add("Jack");
        names.add("Smith");
        names.add("Sam");

        List<String> newNames = new ArrayList<>();
//        for (String name : names) {
//            newNames.add(name.toUpperCase());
//        }
//        System.out.println(newNames);
//

        List<String> collect = names.stream()
                .map(name -> name.toUpperCase())
                 .toList();

        System.out.println(collect);


        int [] arr  = {1,23,4,5,4,35,3};
       IntStream intStream  =  Arrays.stream(arr);
       int sum = intStream.sum();
        System.out.println(sum);


        int [] arr2 = {12,3,123,1,23,12,31};
        System.out.println(Arrays.stream(arr2));




        Integer [] arr3 = {123,123,1,23,12,3,1};
        Stream<Integer> stream2 = Arrays.stream(arr3);

        int s = stream2
                .mapToInt(Integer::intValue)
                .sum();

        List<Integer> listInt = Arrays.stream(arr2)
                .boxed()
                .toList();




    }
}
