package org.example;

import org.example.model.Apple;
import org.example.model.Box;
import org.example.model.Orange;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.stream.IntStream;

public class Application {
    private final static String[] VARIETY_APPLES = {"Granny Smith", "Honeycrisp", "Gala"};
    private final static String[] VARIETY_ORANGES = {"Navel", "Valencia", "Blood orange"};

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);

        List<Apple> apples = new ArrayList<>();
        List<Orange> oranges = new ArrayList<>();

        Box<Apple> appleBox = new Box<>(100);
        Box<Orange> orangeBox = new Box<>(100);

        Random random = new Random();

        IntStream.rangeClosed(1, 150).forEach(i -> {
            apples.add(new Apple(VARIETY_APPLES[random.nextInt(VARIETY_APPLES.length)],
                    Math.round(random.nextDouble(1, 2) * 100.0) / 100.0)
            );
            oranges.add(new Orange(VARIETY_ORANGES[random.nextInt(VARIETY_ORANGES.length)],
                    Math.round(random.nextDouble(1, 2) * 100.0) / 100.0)
            );
        });

        apples.forEach(appleBox::addFruit);
        oranges.forEach(orangeBox::addFruit);

        System.out.println("After fill:");
        System.out.printf("Apple box weight - %.2f%n" ,appleBox.getWeight());
        System.out.printf("Orange box weight - %.2f%n", orangeBox.getWeight());
        System.out.println();

        Box<Apple> otherAppleBox = new Box<>(50);
        Box<Orange> otherOrangeBox = new Box<>(50);

        otherAppleBox.pour(appleBox);
        otherOrangeBox.pour(orangeBox);

        System.out.println("After pour:");
        System.out.printf("Apple box weight - %.2f%n" ,appleBox.getWeight());
        System.out.printf("Orange box weight - %.2f%n", orangeBox.getWeight());
        System.out.printf("Other apple box weight - %.2f%n" ,otherAppleBox.getWeight());
        System.out.printf("Other orange box weight - %.2f%n", otherOrangeBox.getWeight());
        System.out.println();

        System.out.println("Compare by weight:");
        System.out.printf("Is equals: %b%n", appleBox.compareTo(otherAppleBox) == 0);
        System.out.printf("Is equals: %b%n", otherAppleBox.compareTo(otherOrangeBox) == 0);
    }
}