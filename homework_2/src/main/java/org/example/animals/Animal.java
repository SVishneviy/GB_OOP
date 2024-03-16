package org.example.animals;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Animal {
    protected final String name;
    protected int age;
    protected int appetite;
    protected boolean satisfied;

    public void eat(int food) {
        satisfied = food >= appetite;
    }
}
