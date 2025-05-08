package org.example.collection.qeue;

import java.util.*;
import java.util.concurrent.DelayQueue;

public class App {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<String>();
        queue.add("John");
        queue.add("Jane");
        queue.add("Jack");
        queue.add("Jill");
        queue.add("Jane");

        for (String s : queue) {
            System.out.println(s);
        }

        System.out.println( );

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.poll());

        System.out.println();

        Deque<String> dq = new ArrayDeque<String>();
        dq.add("John");
        dq.add("Jane");
        dq.add("Jack");
        dq.add("Jill");
        dq.add("Jane");

        for (String s : dq) {
            System.out.println(s);
        }

        System.out.println();

        System.out.println(dq.removeFirst());
        System.out.println(dq.removeLast());

    }
}
