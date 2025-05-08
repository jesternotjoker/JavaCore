package org.example.functionalInterface;


@FunctionalInterface
public interface Check<T> {

    default void info(){
        System.out.println("Check implemented functionalInterface");
    }
    default void info2(){
        System.out.println("Check implemented functionalInterface");
    }



    boolean check(T t);

}
