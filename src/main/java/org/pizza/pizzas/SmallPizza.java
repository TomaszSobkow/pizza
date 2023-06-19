package org.pizza.pizzas;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("small")
public class SmallPizza extends Pizza {

    public SmallPizza(@Value("50") int price) {
        super( price);
        super.setPizzaName("Small Pizza");
    }
}
