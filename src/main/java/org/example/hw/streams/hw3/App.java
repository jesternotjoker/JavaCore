package org.example.hw.streams.hw3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        /*
        У тебя есть список объектов типа Person с полем age. Найди самого старшего человека, используя stream() и max().
         */
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("James", 50));
        personList.add(new Person("Alan", 46));
        personList.add(new Person("Mary", 24));
        personList.add(new Person("Monica", 18));
        personList.add(new Person("Sam", 56));
        personList.add(new Person("Jessica", 35));
        personList.add(new Person("Harry", 24));
        personList.add(new Person("Linda", 20));
        personList.add(new Person("Rachel", 56));
        personList.add(new Person("Tom", 53));

        Optional<Person> maxAgePerson = personList.stream()
                .max(Comparator.comparing(Person::getAge));

        System.out.println(maxAgePerson);
    }
}