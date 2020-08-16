package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

class ArrayOperationsTest {

    private static final int[] numbers = {5, 10, 15, 100};

    @Test
    void testGetAverage() {
        //Given
        ArrayOperations arrayOperations = new ArrayOperationsImplementation();

        // When
        double average = arrayOperations.getAverage(numbers);

        // Then
        Assertions.assertEquals(32.5, average);
    }
}
