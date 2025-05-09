package org.example.hw.forEachMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*
        Дан объект Map<String, Integer>.
        Пройдитесь по нему с помощью Iterator и увеличьте значение каждого элемента на 10.
         */

        Map<String, Integer> map = new HashMap<>();
        map.put("One", 3);
        map.put("Two", 4);
        map.put("Three", 1);
        map.put("Four", 10);
        map.put("Five", 5);
        map.put("Six", 8);
        map.put("Seven", 2);
        map.put("Eight", 11);

        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<String, Integer> it = iter.next();
            it.setValue(it.getValue() + 10);
        }

        System.out.println(map);
    }
}
