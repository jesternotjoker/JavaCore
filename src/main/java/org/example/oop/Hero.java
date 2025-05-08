package org.example.oop;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor

public class Hero implements Cloneable {
    private String name;
    private int power;


    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Hero(name, power);
    }
}
