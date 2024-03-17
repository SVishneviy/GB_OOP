package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class EmployeeFabric {
    private final static String[] NAMES = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен",
            "Клим", "Панкратий", "Рубен", "Герман"};
    private final static String[] SURNAMES = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин",
            "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};
    private final static Random RANDOM = new Random();

    public static List<Employee> generateEmployees(int count) {
        List<Employee> employees = new ArrayList<>(count);

        IntStream.rangeClosed(1, count).forEach(i -> {
            String name = NAMES[RANDOM.nextInt(NAMES.length)];
            String surname = SURNAMES[RANDOM.nextInt(SURNAMES.length)];
            int age = RANDOM.nextInt(18, 50);

            switch (RANDOM.nextInt(2)) {
                case 0 -> {
                    double hourlyRate = Math.round(RANDOM.nextDouble(500, 700) / 100) * 100;
                    Freelancer freelancer = new Freelancer(name, surname, age, hourlyRate);
                    freelancer.calculateSalary();
                    employees.add(freelancer);
                }
                case 1 -> {
                    double salary = Math.round(RANDOM.nextDouble(20_000, 30_000) / 1000) * 1000;
                    employees.add(new Worker(name, surname, age).setSalary(salary));
                }
            }
        });

        return employees;
    }
}