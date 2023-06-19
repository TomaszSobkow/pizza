package org.pizza;

import org.pizza.config.AutoConfig;
import org.pizza.config.Config;
import org.pizza.interfaces.IOrder;
import org.pizza.order.Order;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PizzaApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
        //IOrder order = (IOrder) context.getBean("order");
        IOrder order = context.getBean(Order.class);
        order.printOrder();
    }
}