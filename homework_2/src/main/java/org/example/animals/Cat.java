package org.example.animals;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@ToString(callSuper = true)
public class Cat extends Animal {
    @Accessors(fluent = true)
    private final boolean hasTail;

    public Cat(String name, int age, int appetite, boolean satisfied, boolean hasTail) {
        super(name, age, appetite, satisfied);
        this.hasTail = hasTail;
    }
}
