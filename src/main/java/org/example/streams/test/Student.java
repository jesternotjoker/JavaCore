package org.example.streams.test;

import java.time.LocalDateTime;
import java.util.Objects;

public class Student {
    private String name;
    private String group;
    private LocalDateTime enrollmentDate;

    // Конструктор
    public Student(String name, String group, LocalDateTime enrollmentDate) {
        this.name = name;
        this.group = group;
        this.enrollmentDate = enrollmentDate;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public LocalDateTime getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDateTime enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    // Метод toString для удобного вывода
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", enrollmentDate=" + enrollmentDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(name, student.name) && Objects.equals(group, student.group) && Objects.equals(enrollmentDate, student.enrollmentDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group, enrollmentDate);
    }
}
