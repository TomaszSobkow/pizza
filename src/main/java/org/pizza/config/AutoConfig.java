package org.pizza.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({"org.pizza.pizzas","org.pizza.order"})
@Import(Config.class)
public class AutoConfig {

}
