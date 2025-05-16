package org.example.hw.filesHw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        /*
        Создайте текстовый файл notes.txt и запишите в него несколько строк текста: например, список дел на день.

        Чтение из файла
        Прочитайте содержимое файла notes.txt, созданного ранее, и выведите его на экран.

        Дозапись в существующий файл
        Добавьте ещё одну строку в конец файла notes.txt, не перезаписывая его содержимое.
         */

        Path path = Paths.get("C:\\Users\\user\\IdeaProjects\\JavaCore\\src\\main\\java\\org\\example\\hw\\filesHw\\notes.txt");

        List<String> listStrings = new ArrayList<>();
        listStrings.add("Приготовить завтра");
        listStrings.add("Помыть посуду");
        listStrings.add("Сделать зарядку");
        listStrings.add("Убраться в квартире");
        listStrings.add("Пообедать");

        Files.writeString(path, "Список дел:\n", StandardOpenOption.CREATE);
        for (String str : listStrings) {
            Files.writeString(path, str + "\n", StandardOpenOption.APPEND);
        }

        List<String> stringsFromFile = Files.readAllLines(path);
        stringsFromFile.forEach(System.out::println);

        System.out.println();

        Files.writeString(path, "Посмотреть кино", StandardOpenOption.APPEND);
    }
}
