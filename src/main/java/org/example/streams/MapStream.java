package org.example.streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class MapStream {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Adman", 11));
        students.add(new Student("Sam", 1222));
        students.add(new Student("Amy", 313));
        students.add(new Student("Roger", 12312));
        students.add(new Student("Carlos", 1233));
        students.add(new Student("Regina", 112312));


        double v = students.stream()
                .map(Student::getBalance)
                .mapToInt(Integer::intValue)
                .average().orElse(0);

        System.out.println(v);

        List<Integer> lengthNames = students.stream()
                .map(student -> student.getName().length())
                //.map(String::length)
                .toList();
        System.out.println(lengthNames);

        HashSet<Student> skipStudents = students.stream()
                .skip(2)
                .collect(Collectors.toCollection(HashSet::new));









    }


}
