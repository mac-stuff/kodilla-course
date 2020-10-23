package com.kodilla.stream.invoice.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleInvoiceTest {

    @Test
    void testGetValueToPay() {

        //Given
        SimpleInvoice invoice = new SimpleInvoice();
        SimpleProduct simpleProduct1 = new SimpleProduct("Product 2", 11.99);
        SimpleItem simpleItem1 = new SimpleItem(simpleProduct1, 3.5);

        //When
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 1", 17.28), 2.0));
        invoice.addItem(simpleItem1);
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 3",  6.49), 5.0));

        //Then
        assertEquals(108.975, invoice.getValueToPay(), 0.001);
    }
}
