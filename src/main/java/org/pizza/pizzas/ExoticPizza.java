package org.pizza.pizzas;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("exotic")
public class ExoticPizza extends Pizza {

    public ExoticPizza(@Value("50") int price) {
        super(price);
        super.setPizzaName("Exotic Pizza");
    }
}
