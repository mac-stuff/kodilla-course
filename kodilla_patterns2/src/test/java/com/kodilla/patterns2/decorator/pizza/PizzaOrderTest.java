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
        assertEquals("Basic Margherita.", description);
    }

    @Test
    public void testExtraBaconMushroomsPizzaGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BaconDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(35), theCost);
    }

    @Test
    public void testExtraBaconMushroomsPizzaGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BaconDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Basic Margherita. Additional bacon. Additional mushrooms.", description);
    }

    @Test
    public void testExtraMozzarellaSalamiPeperoniPizzaGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MozzarellaDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new PeperoniDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(175), theCost);
    }

    @Test
    public void testExtraMozzarellaSalamiPeperoniPizzaGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MozzarellaDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new PeperoniDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Basic Margherita. Additional mozzarella. Additional salami. Additional peperoni.", description);
    }

    @Test
    public void testExtraMozzarellaSalamiPeperoniBaconPizzaGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MozzarellaDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new PeperoniDecorator(theOrder);
        theOrder = new BaconDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(185), theCost);
    }

    @Test
    public void testExtraMozzarellaSalamiPeperoniBaconPizzaGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MozzarellaDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new PeperoniDecorator(theOrder);
        theOrder = new BaconDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Basic Margherita. Additional mozzarella. Additional salami. Additional peperoni. Additional bacon.", description);
    }
}
