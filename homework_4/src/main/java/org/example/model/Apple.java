package org.example.model;

import lombok.ToString;

@ToString(callSuper = true)
public class Apple extends Fruit {
    public Apple(String variety, double weight) {
        super(variety, weight);
    }
}
