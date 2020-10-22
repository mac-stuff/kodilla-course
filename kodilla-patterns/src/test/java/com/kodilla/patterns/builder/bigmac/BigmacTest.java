package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigmacTest {

    @Test
    void testBigmacIngredients() {

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("onion")
                .bun("with sesame")
                .sauce("spicy")
                .ingredient("cucumber")
                .ingredient("chilli peppers")
                .ingredient("mushrooms")
                .build();

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(4, howManyIngredients);
    }
}