package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTest {

    @Test
    void testAddCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //Then
        assertEquals(6, calculator.add(2, 4));
    }

    @Test
    void testSubCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //Then
        assertEquals(-2, calculator.sub(2, 4));
    }

    @Test
    void testMulCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //Then
        assertEquals(8, calculator.mul(2, 4));
    }

    @Test
    void testDivCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //Then
        assertEquals(0.5, calculator.div(2, 4));
    }

    @Test
    void testDivByZeroCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        String expectedMessage = new IllegalArgumentException("Argument 'divisor' is 0.").getMessage();

        try {
            calculator.div(2, 0);
        } catch (Exception exception) {
            assertEquals(expectedMessage, exception.getMessage());
        }
    }
}