package org.example.oop.oop1;

public class Tester extends Employee implements WritingCode{

    public Tester(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void hello() {
        System.out.println("Hello im Tester");
    }

    public void startTest(){
        System.out.println("Starting Test");
    }

    @Override
    public void writeCode() {
        System.out.println("Hello, Im Tester and im write code!");
    }
}
