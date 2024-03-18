package org.example.model;

import lombok.Data;

@Data
public abstract class Fruit {
    protected final String variety;
    protected final double weight;

}
