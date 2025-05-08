package org.example.collection.comparator;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o2.getAge(),o1.getAge());
    }
}
