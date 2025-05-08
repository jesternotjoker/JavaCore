package org.example.oop.oop1;

public class Developer extends Employee implements WritingCode{

    public Developer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void hello() {
        System.out.println("Hello im Developer");
    }

    @Override
    public void writeCode() {
        System.out.println("I'm Developer i write code  ");
    }
}
