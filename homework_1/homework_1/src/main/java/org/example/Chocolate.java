package org.example;

import lombok.Getter;

@Getter
public class Chocolate extends Product {
    private final Type type;

    public Chocolate(String name, String brand, double weight, double price, Type type) {
        super(name, brand, weight, price);
        this.type = type;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", weight=" + getWeight() +
                ", price=" + getPrice() +
                ", type=" + getType() +
                '}';
    }

    public enum Type {
        BITTER,
        MILK
    }
}

