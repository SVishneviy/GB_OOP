package org.example.model;

import lombok.ToString;

@ToString(callSuper = true)
public class Orange extends Fruit {
    public Orange(String variety, double weight) {
        super(variety, weight);
    }
}
