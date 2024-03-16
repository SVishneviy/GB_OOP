package org.example;

import lombok.*;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Plate {
    private int food;

    public void addFood(int amount) {
        food += amount;
    }

    public void reduceFood(int amount) {
        if (food >= amount) {
            food -= amount;
        }
    }

    public void info() {
        System.out.println("Plate: " + food);
    }
}
