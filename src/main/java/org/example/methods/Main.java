package org.example.methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int res = summInt(3, 5);
        System.out.println(res);

        int[] arr = intArr(6, 2);
        System.out.println(Arrays.toString(arr));
    }

    static int summInt (int a, int b){
        return a+b;
    }

    static int[] intArr (int lengthArray, int fillNumber){
        int[] r = new int[lengthArray];
        for (int i = 0; i < r.length; i++) {
            r[i] = fillNumber;
        }

        return r;
    }

}
