package com.kodilla.exception.test;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionHandlingTest {

    @Test
    public void checkIfProbablyIWillThrowExceptionThrowException() {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();

        // When & Then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.0, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.0, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(-2.0, 1.5))
        );
    }

    @Test
    public void checkIfProbablyIWillThrowExceptionDoesNotThrowException() {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();

        // When & Then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.0, 7.5));
    }

    @Test
    public void checkIfProbablyIWillThrowExceptionReturnCorrectMessage() throws Exception {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();

        // When
        String result = secondChallenge.probablyIWillThrowException(1.0, 7.5);

        // When & Then
        assertEquals("Done!", result);
    }

}