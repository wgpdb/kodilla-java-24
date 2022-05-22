package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AmericanPanDecorator extends AbstractPizzaOrderDecorator {

    public AmericanPanDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(4));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " / American Pan crust /";
    }
}
