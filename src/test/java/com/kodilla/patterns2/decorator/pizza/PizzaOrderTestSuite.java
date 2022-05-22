package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        //When
        BigDecimal calculatedPrice = theOrder.getPrice();

        //Then
        assertEquals(new BigDecimal(15), calculatedPrice);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Pizza order: (standard ingredients: tomato sauce + mozzarella)", description);
    }

    @Test
    public void testPizzaOrderWithCheesyCrustPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheesyCrustDecorator(theOrder);

        //When
        BigDecimal calculatedPrice = theOrder.getPrice();

        //Then
        assertEquals(new BigDecimal(23), calculatedPrice);
    }

    @Test
    public void testPizzaOrderWithCheesyCrustDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheesyCrustDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Pizza order: (standard ingredients: tomato sauce + mozzarella) / cheesy crust /",
                description);
    }

    @Test
    public void testPizzaOrderThinItalianWithSalamiAndOlivesPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ThinItalianDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new OlivesDecorator(theOrder);

        //When
        BigDecimal calculatedPrice = theOrder.getPrice();

        //Then
        assertEquals(new BigDecimal(21), calculatedPrice);
    }

    @Test
    public void testPizzaOrderThinItalianWithSalamiAndOlivesDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ThinItalianDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new OlivesDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        assertEquals("Pizza order: (standard ingredients: tomato sauce + mozzarella) / thin Italian crust / " +
                "+ salami + olives", description);
    }

    @Test
    public void testPizzaOrderAmericanPanWithExtraCheeseAndIngredientsPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new AmericanPanDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);

        //When
        BigDecimal calculatedPrice = theOrder.getPrice();

        //When
        assertEquals(new BigDecimal(25), calculatedPrice);
    }

    @Test
    public void testPizzaOrderAmericanPanWithExtraCheeseAndIngredientsDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new AmericanPanDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //When
        assertEquals("Pizza order: (standard ingredients: tomato sauce + mozzarella) / American Pan crust / " +
                "+ extra cheese + ham + mushrooms", description);
    }
}