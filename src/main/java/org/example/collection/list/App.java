package org.example.collection.list;



import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10_000_000; i++) {
            list.add(7);
        }


        long startTime = System.nanoTime();
        System.out.println(list.get(5_000_000));
        long endTime = System.nanoTime();


        System.out.println((endTime - startTime));
        System.out.println((endTime - startTime)/1_000_000);
        System.out.println((endTime - startTime)/1_000_000_000);

    }
}

