package org.example;

import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeFabric.generateEmployees(50);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            printSorts();
            System.out.print("Enter number: ");
            switch (scanner.nextInt()) {
                case 1 -> print(employees, Employee::getName, Employee.class);
                case 2 -> print(employees, Employee::getSurname, Employee.class);
                case 3 -> print(employees, Employee::getAge, Employee.class);
                case 4 -> print(employees, Employee::getSalary, Employee.class);
                case 5 -> print(employees, e -> ((Freelancer) e).getHourlyRate(), Freelancer.class);
                case 0 -> System.exit(0);
            }
        }
    }

    public static <T extends Comparable<T>> void print(List<Employee> employees, Function<Employee, T> function,
                                                       Class<? extends Employee> cl) {
        employees.stream()
                .filter(cl::isInstance)
                .sorted(Comparator.comparing(function))
                .forEach(e -> System.out.printf("Name = %-10s, Surname = %-10s, Age = %d, Salary = %-10.2f%s%n",
                        e.getName(),
                        e.getSurname(),
                        e.getAge(),
                        e.getSalary(),
                        e instanceof Freelancer ? ", Hourly rate = " + ((Freelancer) e).getHourlyRate() : ""));
    }

    public static void printSorts() {
        String listSorts =
                """
                                        
                        || -- Sort by -- ||
                        1. Name
                        2. Surname
                        3. Age
                        4. Salary
                        5. Hourly rate (only Freelancer)
                        0. Exit
                        || ------------- ||
                        """;
        System.out.println(listSorts);
    }
}