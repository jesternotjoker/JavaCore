package org.example.generics;

public class Student <T>{
    private String name;
    public T gadjet;

    public Student(String name, T gadjet) {
        this.name = name;
        this.gadjet = gadjet;
    }


    public <S extends Number > Long  calcSum(S [] s){
        Long sum = 0L;
        for (S s1 : s) {
            sum += s1.longValue();
        }
        return sum;
    }




}
