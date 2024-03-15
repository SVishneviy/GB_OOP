package org.example;

import lombok.Data;

import java.util.List;

@Data
public class VendingMachine {
    private final List<Product> products;

    public Product getProduct(String name) {
        return products.stream()
                .filter(p -> p.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public Product getProduct(String name, double price) {
        return products.stream()
                .filter(p -> p.getName().equals(name))
                .filter(p -> p.getPrice() == price)
                .findFirst()
                .orElse(null);
    }

    public Cheese getCheese(String name, int fat) {
        return products.stream()
                .filter(p -> p instanceof Cheese)
                .map(p -> (Cheese) p)
                .filter(p -> p.getName().equals(name))
                .filter(ch -> ch.getFat() == fat)
                .findFirst()
                .orElse(null);
    }

    public Product getChocolate(String name, Chocolate.Type type) {
        return products.stream()
                .filter(p -> p instanceof Chocolate)
                .map(p -> (Chocolate) p)
                .filter(p -> p.getName().equals(name))
                .filter(ch -> ch.getType() == type)
                .findFirst()
                .orElse(null);
    }
}
