package org.example;

import org.example.animals.Cat;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    private static final Random random = new Random();

    public static void main(String[] args) {
        Plate plate = new Plate(4000);

        List<Cat> cats = generateCats();

        feedCats(cats, plate);

        plate.addFood(100);

        feedCats(cats, plate);

        cats.forEach(cat-> System.out.printf("Name: %s, satisfied: %b%n",
                cat.getName(),
                cat.isSatisfied())
        );
        plate.info();
    }

    private static void feedCats(List<Cat> cats, Plate plate) {
        cats.stream()
                .filter(cat -> !cat.isSatisfied())
                .forEach(cat -> {
                    cat.eat(plate.getFood());
                    if (cat.isSatisfied()) {
                        plate.reduceFood(cat.getAppetite());
                    }
                });
    }


    private static List<Cat> generateCats() {
        List<Cat> cats = new ArrayList<>();

        IntStream.rangeClosed(1, 100).forEach(i -> {
            int age = random.nextInt(1, 15);
            int appetite = random.nextInt(30, 60);
            cats.add(new Cat("Cat " + i, age, appetite, false, random.nextBoolean()));
        });

        return cats;
    }
}