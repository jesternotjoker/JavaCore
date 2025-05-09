package org.example.streams;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Queue;

public class DistinctStream {
    public static void main(String[] args) {
        Deque<Integer> numbes = new ArrayDeque<>();
        numbes.push(1);
        numbes.push(2);
        numbes.push(1);
        numbes.push(4);
        numbes.push(2);
        numbes.push(1);

        List<Integer> list = numbes.stream()
                .distinct()
                .toList();
        System.out.println(list);




    }
}
