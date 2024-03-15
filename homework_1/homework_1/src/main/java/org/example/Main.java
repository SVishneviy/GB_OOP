package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Bred("Bred 1", "Brand 1", 300, 50),
                new Bred("Bred 1", "Brand 1", 300, 55),
                new Bred("Bred 2", "Brand 2", 500, 70),
                new Cheese("Cheese 1", "Brand 3", 100, 200, 45),
                new Cheese("Cheese 2", "Brand 4", 200, 500, 50),
                new Chocolate("Chocolate 1", "Brand 5", 100, 150, Chocolate.Type.MILK),
                new Chocolate("Chocolate 2", "Brand 6", 150, 300, Chocolate.Type.BITTER)
        );

        VendingMachine vendingMachine = new VendingMachine(products);

        Bred bred1 = (Bred) vendingMachine.getProduct("Bred 1");
        Bred bred2 = (Bred) vendingMachine.getProduct("Bred 1", 55);
        System.out.println(bred1);
        System.out.println(bred2);

        Cheese cheese = vendingMachine.getCheese("Cheese 1", 45);
        System.out.println(cheese);

        Chocolate chocolate1 = (Chocolate) vendingMachine.getChocolate("Chocolate 1", Chocolate.Type.MILK);
        Chocolate chocolate2 = (Chocolate) vendingMachine.getChocolate("Chocolate 1", Chocolate.Type.BITTER);
        System.out.println(chocolate1);
        System.out.println(chocolate2);
    }
}