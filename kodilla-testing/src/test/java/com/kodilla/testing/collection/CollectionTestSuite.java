package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("when start exterminate method with empty list" +
            "then method should return empty list"
    )

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);
        System.out.println("Testing " + result);
        //Then
        Assertions.assertEquals(Arrays.asList(), result);
    }

    @DisplayName("when start exterminate method with not empty list" +
            "then method should return [4, 8, 10, 12]"
    )
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, 4, 5, 8, 10, 12));
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);
        System.out.println("Testing " + result);
        //Then
        Assertions.assertEquals(Arrays.asList(4, 8, 10, 12), result);
    }
}