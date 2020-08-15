package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class WorldTest {

    @Test
    void testGetPeopleQuantity() {
        // Given
        World world = new World();

        // When
        Continent europe = new Continent();
        Country poland = new Country("Poland", new BigDecimal("37850596"));
        europe.setCountry(poland);
        Country italy = new Country("Italy", new BigDecimal("60465251"));
        europe.setCountry(italy);
        Country germany = new Country("Germany", new BigDecimal("60465251"));
        europe.setCountry(germany);

        Continent africa = new Continent();
        Country nigeria = new Country("Nigeria", new BigDecimal("200963599"));
        africa.setCountry(nigeria);
        Country ethiopia = new Country("Ethiopia", new BigDecimal("112078730"));
        africa.setCountry(ethiopia);
        Country egypt = new Country("Egypt", new BigDecimal("100173395"));
        africa.setCountry(egypt);

        world.setContinent(europe);
        world.setContinent(africa);

        // Then
        assertEquals(new BigDecimal("571996822"), world.getWorldPeopleQuantity());
    }
}
