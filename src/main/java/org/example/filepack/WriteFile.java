package org.example.filepack;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteFile {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\user\\IdeaProjects\\JavaCore\\src\\main\\java\\org\\example\\filepack\\info2.txt");


        String text = "День второй.Было чувство что я тут временно и скоро уеду";

        try {
            Files.writeString(path, text+"\n", StandardCharsets.UTF_8, StandardOpenOption.APPEND,StandardOpenOption.CREATE);
        }
        catch (Exception e) {
            System.out.println("Не удалось внести изменения в файл");
        }
    }
}
