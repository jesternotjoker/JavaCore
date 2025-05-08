package org.example.oop.oop1;

public class Manager extends Employee{

    public Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void hello() {
        System.out.println("Hello im Manager");
    }
}
