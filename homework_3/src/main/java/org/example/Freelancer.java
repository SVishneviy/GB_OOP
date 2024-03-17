package org.example;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
public class Freelancer extends Employee {
    private final static double RATIO = 20.8 * 8;
    private double hourlyRate;

    public Freelancer(String name, String surname, int age, double hourlyRate) {
        super(name, surname, age);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        salary = RATIO * hourlyRate;
        return salary;
    }

    @Override
    public Freelancer setSalary(double salary) {
        throw new UnsupportedOperationException("Cannot set salary directly for Freelancer. Please use calculateSalary.");
    }
}

