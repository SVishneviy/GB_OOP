package org.example.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Box <T extends Fruit> implements Comparable<Box<?>> {
    private List<T> fruits = new ArrayList<>();
    private final double weightLimit;

    public boolean addFruit(T fruit) {
        if (getWeight() + fruit.getWeight() <= weightLimit) {
            fruits.add(fruit);
            return true;
        }
        return false;
    }

    public double getWeight() {
        return fruits.stream()
                .mapToDouble(Fruit::getWeight)
                .sum();
    }

    public void pour(Box<T> otherBox) {
        List<T> otherFruits = otherBox.getFruits();
        otherFruits.removeIf(this::addFruit);
    }

    @Override
    public int compareTo(Box<?> o) {
        return Double.compare(getWeight(), o.getWeight());
    }
}
