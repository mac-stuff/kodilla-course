package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PizzaOrderTest {

    @Test
    public void testBasicOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        // When
        BigDecimal calculatedCost = theOrder.getCost();

        // Then
        assertEquals(new BigDecimal(5), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        // When
        String description = theOrder.getDescription();

        // Then
        assertEquals("Enjoy your meal!", description);
    }

    @Test
    public void testChildPizzaGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ChildPizzaDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(15), theCost);
    }

    @Test
    public void testChildPizzaGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ChildPizzaDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Enjoy your meal! Bon appetit!", description);
    }

    @Test
    public void testExpressPizzaGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExpressPizzaDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(25), theCost);
    }

    @Test
    public void testExpressPizzaGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExpressPizzaDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Enjoy your meal! Bon appetit!", description);
    }

    @Test
    public void testGlutenFreePizzaGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new GlutenFreePizzaDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(55), theCost);
    }

    @Test
    public void testGlutenFreePizzaGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new GlutenFreePizzaDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Enjoy your meal! Bon appetit!", description);
    }

    @Test
    public void testVegePizzaGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new VegePizzaDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(25), theCost);
    }

    @Test
    public void testVegePizzaGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new VegePizzaDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Enjoy your meal! Bon appetit!", description);
    }

    @Test
    public void testVipPizzaGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new VipPizzaDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(105), theCost);
    }

    @Test
    public void testVipPizzaGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new VipPizzaDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Enjoy your meal! Bon appetit!", description);
    }
}
