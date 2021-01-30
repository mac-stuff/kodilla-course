package com.kodilla.patterns2.decorator.pizza;


import java.math.BigDecimal;

public class MozzarellaDecorator extends AbstractPizzaOrderDecorator {

    public MozzarellaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(100));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Additional mozzarella.";
    }
}
