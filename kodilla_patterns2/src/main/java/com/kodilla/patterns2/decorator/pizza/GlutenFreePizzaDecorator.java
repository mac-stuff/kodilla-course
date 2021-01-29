package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class GlutenFreePizzaDecorator extends AbstractPizzaOrderDecorator {
    
    public GlutenFreePizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(50));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Bon appetit!";
    }
}
