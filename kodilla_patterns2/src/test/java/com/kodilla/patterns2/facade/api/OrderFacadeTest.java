package com.kodilla.patterns2.facade.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderFacadeTest {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrderFacadeTest.class);

    @Autowired
    private OrderFacade orderFacade;

    @Test
    public void testProcessOrder() throws OrderProcessingException {
        //Given
        //When
        //orderFacade.processOrder(new OrderDto(), 1L);

        //Then
    }
}