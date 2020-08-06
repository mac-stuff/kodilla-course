package com.kodilla.testing.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void testAdd() {
        //Given
        Calculator calculator = new Calculator(2, 5);
        //When
        int result = calculator.add();
        System.out.println("Testing " + result);
        //Then
        Assertions.assertEquals(7, result);
    }

    @Test
    void testSubtract() {
        //Given
        Calculator calculator = new Calculator(2, 5);
        //When
        int result = calculator.subtract();
        System.out.println("Testing " + result);
        //Then
        Assertions.assertEquals(-3, result);
    }
}