package org.example.functionalInterface;

import org.example.collection.comparator.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Nike", 24, 37000));
        persons.add(new Person("John", 17, 43000));
        persons.add(new Person("John2", 15, 143000));
        persons.add(new Person("John3", 24, 3000));
        persons.add(new Person("John4", 24, 1443000));
        persons.add(new Person("John5", 14, 73000));
        persons.add(new Person("Michael", 32, 65000));


        viewPersons(persons,p->p.getAge() > 20);
        System.out.println();
        viewPersons(persons,p->p.getSalary() > 200000);
        viewPersonsConsumer(persons,p-> p.setSalary(p.getSalary() * 2));


        List<String> names = viewPersonsFunctional(persons, person -> person.getName());



    }

    public static void viewPersons(List<Person> personList, Predicate<Person> predicate){
        for (Person person : personList) {
            if (predicate.test(person)) System.out.println(person);
        }
    }



    public static void viewPersonsConsumer(List<Person> personList, Consumer<Person> consumer){
        for (Person person : personList) {
            consumer.accept(person);
        }
    }


    public static  List<String> viewPersonsFunctional(List<Person> personList, Function<Person,String> function){
        List<String> list = new ArrayList<>();
        for (Person person : personList) {
            String apply = function.apply(person);
            list.add(apply);
        }
        return list;
    }








}
