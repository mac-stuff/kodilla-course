package com.kodilla.testing.shape;

import com.kodilla.testing.shape.*;
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
            Square square = new Square();

            //When
            String result = square.getShapeName();

            //Then
            Assertions.assertEquals("square", result.toLowerCase());
        }

        @Test
        void testGetShapeNameWhenNotExisting() {
            //Given
            Square square = new Square();

            //When
            String result = square.getShapeName();

            //Then
            Assertions.assertEquals("", result.toLowerCase());
        }

        @Test
        void testGetField() {
            //Given
            Square square = new Square();

            //When
            double result = square.getField();

            //Then
            Assertions.assertEquals(25.00, result);
        }

        @Test
        void testGetFieldWhenNotExisting() {
            //Given
            Square square = new Square();

            //When
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
            Circle circle = new Circle();

            //When
            String result = circle.getShapeName();

            //Then
            Assertions.assertEquals("square", result.toLowerCase());
        }

        @Test
        void testGetShapeNameWhenNotExisting() {
            //Given
            Circle circle = new Circle();

            //When
            String result = circle.getShapeName();

            //Then
            Assertions.assertEquals("", result.toLowerCase());
        }

        @Test
        void testGetField() {
            //Given
            Circle circle = new Circle();

            //When
            double result = circle.getField();

            //Then
            Assertions.assertEquals(25.00, result);
        }

        @Test
        void testGetFieldWhenNotExisting() {
            //Given
            Circle circle = new Circle();

            //When
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
            Triangle triangle = new Triangle();

            //When
            String result = triangle.getShapeName();

            //Then
            Assertions.assertEquals("square", result.toLowerCase());
        }

        @Test
        void testGetShapeNameWhenNotExisting() {
            //Given
            Triangle triangle = new Triangle();

            //When
            String result = triangle.getShapeName();

            //Then
            Assertions.assertEquals("", result.toLowerCase());
        }

        @Test
        void testGetField() {
            //Given
            Triangle triangle = new Triangle();

            //When
            double result = triangle.getField();

            //Then
            Assertions.assertEquals(25.00, result);
        }

        @Test
        void testGetFieldWhenNotExisting() {
            //Given
            Triangle triangle = new Triangle();

            //When
            double result = triangle.getField();

            //Then
            Assertions.assertEquals(0, result);
        }
    }
}