package org.pizza.pizzas;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("good")
public class GoodPizza extends Pizza {

    public GoodPizza(@Value("40") int price) {
        super(price);
        super.setPizzaName("Good Pizza");
    }
}
