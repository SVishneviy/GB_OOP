package org.example;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public abstract class Employee implements Comparable<Employee> {

    protected final String name;
    protected final String surname;
    @NonNull
    protected int age;
    protected double salary;

    abstract public double calculateSalary();

    public Employee setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
        return this;
    }

    @Override
    public int compareTo(Employee o) {
        int surNameRes = surname.compareTo(o.surname);
        if (surNameRes == 0) {
            return name.compareTo(o.name);
        }
        return surNameRes;
    }
}

