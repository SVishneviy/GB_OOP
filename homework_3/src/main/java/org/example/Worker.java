package org.example;

public class Worker extends Employee {

    public Worker(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}