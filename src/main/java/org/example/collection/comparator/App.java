package org.example.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Nike", 24, 37000));
        persons.add(new Person("John", 24, 43000));
        persons.add(new Person("John2", 24, 143000));
        persons.add(new Person("John3", 24, 3000));
        persons.add(new Person("John4", 24, 1443000));
        persons.add(new Person("John5", 24, 73000));
        persons.add(new Person("Michael", 32, 65000));


//        PersonComparator personComparator = new PersonComparator();
//
//        Comparator<Person> comparatorByAge = (o1, o2) -> o1.getAge() - o2.getAge();
//
//
//        Comparator<Person> comparatorByAgeAndSalary = (o1, o2) -> {
//            int sortByAge = o1.getAge() - o2.getAge();
//            int sortBySalary = o1.getSalary() - o2.getSalary();
//
//            if (sortByAge == 0) {
//                return sortBySalary;
//            }
//            return sortByAge;
//        };
//

        Collections.sort(persons,(o1, o2) -> o1.getAge() - o2.getAge());
        Collections.sort(persons,Comparator.comparing(Person::getName).thenComparing(Person::getAge).reversed());

        persons.forEach(System.out::println);
    }
}




