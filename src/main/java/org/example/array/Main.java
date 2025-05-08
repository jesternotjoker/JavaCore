package org.example.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] b = new String[10];



        for (int i = 0; i < b.length; i++) {
            b[i] = "XXX";
        }

        for (String s : b) {
            System.out.println(s);
        }

        String string = Arrays.toString(b);
        System.out.println(string);


    }
}
