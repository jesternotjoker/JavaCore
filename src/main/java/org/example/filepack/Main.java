package org.example.filepack;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\user\\IdeaProjects\\JavaCore\\src\\main\\java\\org\\example\\filepack\\info.txt");
        boolean existsed = Files.isRegularFile(path);
        System.out.println(existsed);


        try {
            List<String> strings = Files.readAllLines(path);
            strings.forEach(System.out::println);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        System.out.println();
        String s = Files.readString(path);
        System.out.println(s);
    }
}
