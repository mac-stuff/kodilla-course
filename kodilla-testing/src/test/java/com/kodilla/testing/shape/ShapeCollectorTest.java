package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape Collector Test")
class ShapeCollectorTest {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for square.")
    class TestSquare {

        @Test
        void testGetShapeName() {
            //Given
            Square square = new Square(5);

            //When
            String result = square.getShapeName();

            //Then
            Assertions.assertEquals("square", result.toLowerCase());
        }

        @Test
        void testGetField() {
            //Given
            Square square = new Square(5);

            //When
            square.setField();
            double result = square.getField();

            //Then
            Assertions.assertEquals(20.00, result);
        }

        @Test
        void testGetFieldWhenSideValueIsZero() {
            //Given
            Square square = new Square(0);

            //When
            square.setField();
            double result = square.getField();

            //Then
            Assertions.assertEquals(0, result);
        }
    }

    @Nested
    @DisplayName("Tests for circle.")
    class TestCircle {

        @Test
        void testGetShapeName() {
            //Given
            Circle circle = new Circle(5);

            //When
            String result = circle.getShapeName();

            //Then
            Assertions.assertEquals("circle", result.toLowerCase());
        }

        @Test
        void testGetField() {
            //Given
            Circle circle = new Circle(5);

            //When
            circle.setField();
            double result = circle.getField();

            //Then
            Assertions.assertEquals(78.5, result);
        }

        @Test
        void testGetFieldWhenRadiusValueIsZero() {
            //Given
            Circle circle = new Circle(0);

            //When
            circle.setField();
            double result = circle.getField();

            //Then
            Assertions.assertEquals(0, result);
        }
    }

    @Nested
    @DisplayName("Tests for triangle.")
    class TestTriangle {

        @Test
        void testGetShapeName() {
            //Given
            Triangle triangle = new Triangle(5,7);

            //When
            String result = triangle.getShapeName();

            //Then
            Assertions.assertEquals("triangle", result.toLowerCase());
        }

        @Test
        void testGetField() {
            //Given
            Triangle triangle = new Triangle(5, 7);

            //When
            triangle.setField();
            double result = triangle.getField();

            //Then
            Assertions.assertEquals(17.5, result);
        }

        @Test
        void testGetFieldWhenHeightValueIsZero() {
            //Given
            Triangle triangle = new Triangle(10,0);

            //When
            triangle.setField();
            double result = triangle.getField();

            //Then
            Assertions.assertEquals(0, result);
        }
    }
}