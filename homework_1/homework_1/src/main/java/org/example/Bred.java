package org.example;

import lombok.Getter;

@Getter
public class Bred extends Product {

    public Bred(String name, String brand, double weight, double price) {
        super(name, brand, weight, price);
    }
}
