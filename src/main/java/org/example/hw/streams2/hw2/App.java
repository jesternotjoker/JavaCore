package org.example.hw.streams2.hw2;

import org.example.hw.streams2.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        /*
        Объединение имён через Collectors.joining
        Дан список пользователей (List<User>), у каждого из которых есть имя (name).
        Используя stream, объедините все имена в одну строку через запятую и пробел: "Иван, Мария, Петр".
         */
        List<User> users = new ArrayList<>();
        users.add(new User("Валентин"));
        users.add(new User("Анатолий"));
        users.add(new User("Виктория"));
        users.add(new User("Светлана"));
        users.add(new User("Игорь"));
        users.add(new User("Маргарита"));
        users.add(new User("Ирина"));
        users.add(new User("Борис"));
        users.add(new User("Жанна"));
        users.add(new User("Владимир"));

        String collect = users.stream()
                .map(User::getName)
                .collect(Collectors.joining(", ", "", "."));

        System.out.println(collect);
    }
}