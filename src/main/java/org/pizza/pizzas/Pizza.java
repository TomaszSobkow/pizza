package org.pizza.pizzas;

import lombok.Getter;
import lombok.Setter;
import org.pizza.interfaces.IPizza;

@Getter
@Setter
public abstract class Pizza implements IPizza {

    private String pizzaName;
    private int price;

    public Pizza( int price) {
        this.price = price;
    }
}

