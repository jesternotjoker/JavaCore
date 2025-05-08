package org.example.collection.iterableLesson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Bob2");
        names.add("Bob3");
        names.add("Bob31");
        names.add("Bob32");
        names.add("Bob3");
        names.add("Bob33");
        names.add("Bob43");


        ListIterator<String> iterator = names.listIterator();


//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            if (next.equals("Bob3")) {
//                iterator.remove();
//                System.out.println(next);
//            }
//
//        }

        names.removeIf(n -> n.equals("Bob3"));

        System.out.println();
        System.out.println(names);

//        for (int i = 0; i < names.size(); i++) {
//            if (names.get(i).equals("Bob3")) {
//                names.remove("Bob3");
//            }
//            System.out.println(names.get(i));
//        }

//        for (String name : names) {
//            if (name.equals("Jane")) {
//                names.remove(name);
//            }
//            System.out.println(name);
//        }

        //System.out.println(names);
    }
}
