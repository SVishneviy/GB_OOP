package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private final String name;
    private final String brand;
    private final double weight;
    private double price;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", weight=" + getWeight() +
                ", price=" + getPrice() +
                '}';
    }
}
