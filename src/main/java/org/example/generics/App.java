package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Student<Laptop> st1 = new Student<>("Mike", new Laptop());
        Student<Phone> st2 = new Student<>("John", new Phone());

        Double [] s = {2.3,32.3,3.3,2.3,3.3,2.3};
        st2.calcSum(s);

        List<Cat> catList = new ArrayList<>();
        List<Animal> animalList2 = new ArrayList<>();
        List<? extends Animal > animalList  = catList;






    }
}
