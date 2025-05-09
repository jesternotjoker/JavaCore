package org.example.hw.collectionsHw.studentsSort;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        Сортировка Map по значению
        Дан объект Map<String, Double>, представляющий собой список студентов и их средний балл.
        Отсортируйте этот объект по убыванию среднего балла и выведите результат в консоль.
        Используйте Map.Entry, List и Comparator.
         */

        Map<String, Double> students = new HashMap<>();
        students.put("John", 3.5);
        students.put("Adam", 4.0);
        students.put("Sam", 5.0);
        students.put("Amy", 3.5);
        students.put("Rachel", 4.0);
        students.put("Samantha", 3.0);

        List<Map.Entry<String, Double>> listStudents = new ArrayList<>(students.entrySet());
        Comparator<Map.Entry<String, Double>> studentComparator =
                (s1, s2) -> s1.getValue().compareTo(s2.getValue());
        listStudents.sort(studentComparator.reversed());
        System.out.println(listStudents);
    }
}
