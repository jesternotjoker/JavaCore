package org.example.streams.test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

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


        List<Student> students101 = students.stream()
                .filter(s -> s.getGroup().equals("Группа 101"))
                .toList();

        System.out.println(students101);
        System.out.println();

        List<String> studentNames = students101.stream()
                .map(s -> s.getName())
                .toList();

        System.out.println(studentNames);
        System.out.println();

        List<Student> studentsDate = students.stream()
                .filter(s -> s.getEnrollmentDate().getYear() == 2023)
                .toList();

        System.out.println(studentsDate);



    }
}
