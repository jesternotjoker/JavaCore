package org.example.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();
        set.add("test");
        set.add("test2");
        set.add("test3");
        set.add("test");
        set.add("test5");


        set.removeIf( e->e.equals("test2") );

        for (String s : set) {
            System.out.println(s);
        }

        User user1 = new User("Sam", 20);
        User user2 = new User("George", 23);
        User user3 = new User("Sam", 20);

        Set<User> userSet = new HashSet<>();
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);

        for (User user : userSet) {
            System.out.println(user);
        }
    }
}
