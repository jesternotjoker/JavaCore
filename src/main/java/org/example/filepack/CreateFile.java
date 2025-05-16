package org.example.filepack;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {
    public static void main(String[] args) {
        Path infoFile = Paths.get("C:\\Users\\user\\IdeaProjects\\JavaCore\\src\\main\\java\\org\\example\\filepack\\info2.txt");

        try {
            Files.createFile(infoFile);
            System.out.println("Файл создан");
        } catch (Exception e) {
            System.out.println("Ошибка при создании файла");
        }


        Path dir = Paths.get("C:\\Users\\user\\IdeaProjects\\JavaCore\\src\\main\\java\\org\\example\\filepack\\p1\\p2\\p3\\Directory");

        try {
            Files.createDirectories(dir);
            System.out.println("Папка создана");
        }
        catch (Exception e) {
            System.out.println("Папка не создана");
        }


    }

}
