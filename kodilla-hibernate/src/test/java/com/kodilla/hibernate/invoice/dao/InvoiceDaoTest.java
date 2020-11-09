package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import com.kodilla.hibernate.task.Task;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
class InvoiceDaoTest {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {

        //Given
        Product product1 = new Product("foundation");
        Product product2 = new Product("bronzer");
        Product product3 = new Product("concealer");
        List<Item> items = new ArrayList<>(Arrays.asList(
                new Item(product1, new BigDecimal(300), 4, new BigDecimal(1200)),
                new Item(product2, new BigDecimal(350), 2, new BigDecimal(700)),
                new Item(product3, new BigDecimal(200), 1, new BigDecimal(200))));
        Invoice invoice = new Invoice("01/11/2020");
        invoice.setItems(items);

        //When
        invoiceDao.save(invoice);

        //Then
        int id = invoice.getId();
        Optional<Invoice> readInvoice = invoiceDao.findById(id);
        assertTrue(readInvoice.isPresent());

        //CleanUp
        invoiceDao.deleteById(id);
    }
}
