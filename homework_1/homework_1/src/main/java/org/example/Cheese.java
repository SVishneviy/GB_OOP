package org.example;

import lombok.Getter;

@Getter
public class Cheese extends Product {
    private final int fat;

    public Cheese(String name, String brand, double weight, double price, int fat) {
        super(name, brand, weight, price);
        this.fat = fat;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", weight=" + getWeight() +
                ", price=" + getPrice() +
                ", fat=" + getFat() +
                '}';
    }

}
