package org.example.oop;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Elf", 204);
        Hero hero2 = new Hero("Elf", 204);




        Class<? extends Hero> aClass = hero1.getClass();
        System.out.println(aClass.getName());
        Field[] declaredFields = aClass.getDeclaredFields();

        for (Field field : declaredFields) {
            System.out.println(field.getName());
        }


        System.out.println(hero1.equals(hero2));
        System.out.println(hero1.hashCode());
        System.out.println(hero2.hashCode());
    }
}
