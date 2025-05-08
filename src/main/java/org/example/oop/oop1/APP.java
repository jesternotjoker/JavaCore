package org.example.oop.oop1;

public class APP {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Tester("tester Jon", 80_000);
        employees[1] = new Developer("dev Anna", 380_000);
        employees[2] = new Manager("manager stive", 180_000);

        for (Employee employee : employees) {
            if (employee instanceof Tester t) {
                t.startTest();
            }

            //employee.hello();
        }

        Cat.hi();

    }
}
