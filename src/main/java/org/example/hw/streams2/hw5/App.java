package org.example.hw.streams2.hw5;

import org.example.hw.streams2.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        /*
         Группировка с преобразованием значений
         У вас есть список студентов (Student) с полями group и grade.
         Сгруппируйте студентов по группам, а в значениях оставьте только список их оценок.
         */
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Иван", "Группа 01", 3));
        studentList.add(new Student("Ольга", "Группа 02", 4));
        studentList.add(new Student("Дмитрий", "Группа 01", 5));
        studentList.add(new Student("Евгения", "Группа 04", 3));
        studentList.add(new Student("Максим", "Группа 01", 4));
        studentList.add(new Student("Тимур", "Группа 03", 2));
        studentList.add(new Student("Нина", "Группа 02", 4));


        var collect = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGroup, Collectors.mapping(Student::getGrade, Collectors.toList())));

        System.out.println(collect);
    }
}
