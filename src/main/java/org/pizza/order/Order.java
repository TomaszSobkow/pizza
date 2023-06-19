package org.pizza.order;

import org.pizza.interfaces.IOrder;
import org.pizza.interfaces.IPizza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Order implements IOrder {

    private IPizza pizza;

    public Order(@Qualifier("good") IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void printOrder() {
        System.out.println("Order "+pizza.getPizzaName()+ ":  Price "+pizza.getPrice());
    }
}
