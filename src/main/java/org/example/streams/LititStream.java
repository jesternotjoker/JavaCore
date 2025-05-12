package org.example.streams;

import org.example.streams.test.Student;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LititStream {
    public static void main(String[] args) {


        List<org.example.streams.test.Student> students = new ArrayList<>();

        students.add(new Student("Иван Иванов", "Группа 101", LocalDateTime.of(2020, 9, 1, 10, 0)));
        students.add(new Student("Мария Смирнова", "Группа 102", LocalDateTime.of(2020, 9, 2, 11, 30)));
        students.add(new Student("Петр Петров", "Группа 101", LocalDateTime.of(2023, 9, 3, 9, 15)));
        students.add(new Student("Анна Кузнецова", "Группа 103", LocalDateTime.of(2021, 9, 4, 14, 45)));
        students.add(new Student("Сергей Лебедев", "Группа 102", LocalDateTime.of(2021, 9, 5, 16, 0)));
        students.add(new Student("Ольга Соколова", "Группа 103", LocalDateTime.of(2023, 9, 6, 10, 30)));
        students.add(new Student("Дмитрий Федоров", "Группа 101", LocalDateTime.of(2022, 9, 7, 12, 15)));
        students.add(new Student("Екатерина Новикова", "Группа 102", LocalDateTime.of(2023, 9, 8, 13, 20)));
        students.add(new Student("Алексей Морозов", "Группа 103", LocalDateTime.of(2023, 9, 9, 15, 10)));
        students.add(new Student("Татьяна Волкова", "Группа 101", LocalDateTime.of(2023, 9, 10, 9, 50)));


        students.stream()
                .map(Student::getName)
                .limit(3)
                .forEach(System.out::println);

        System.out.println();
        long a = students.stream()
                .map(Student::getName)
                .filter(e -> e.startsWith("А"))
                .count();
        System.out.println(a);


        Integer [] arr1  = {12,3,123,12,3};
        Integer [] arr2  = {12,3,123,12,3};

        List<Integer> list = Stream.concat(Stream.of(arr1), Stream.of(arr2))
                .toList();


    }
}
