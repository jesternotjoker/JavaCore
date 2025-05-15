package org.example.hw.streams.hw6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        /*
        Есть список списков строк. Преобразуй его в плоский поток строк с помощью flatMap(), удали пустые строки,
        сохрани уникальные и верни их количество. Используй filter(), distinct(), count().
         */
        List<String> str1 = new ArrayList<>();
        str1.add("");
        str1.add("New String");
        str1.add("First");
        str1.add("Alt");
        List<String> str2 = new ArrayList<>();
        str2.add("New String");
        str2.add("Hello");
        str2.add("Path");
        List<String> str3 = new ArrayList<>();
        str3.add("");
        str3.add("New String");
        str3.add("");
        str3.add("City");

        List<List<String>> listStrings = new ArrayList<>();
        listStrings.add(str1);
        listStrings.add(str2);
        listStrings.add(str3);

        Long count = listStrings.stream()
                .flatMap(s -> s.stream())
                .filter(s -> s.length() > 0)
                .distinct()
                .count();
        System.out.println(count);
    }
}