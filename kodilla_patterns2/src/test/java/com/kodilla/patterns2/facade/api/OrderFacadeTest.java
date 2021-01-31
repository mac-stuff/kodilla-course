package com.kodilla.patterns2.facade.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderFacadeTest {

    @Autowired
    private OrderFacade orderFacade;

    @Test
    public void testProcessOrder() {

        Exception exception = assertThrows(OrderProcessingException.class, () ->
                orderFacade.processOrder(new OrderDto(), 9L));
        assertEquals("User is not authorised", exception.getMessage());
    }
}