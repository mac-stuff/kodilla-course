package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionHandlingTest {

    @Test
    public void checkIfIThrowException() {
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
    public void checkIfINotThrowException() {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();

        // When & Then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.0, 7.5));
    }

    @Test
    public void checkIfIThrowExceptionAndReturnCorrectMessage() throws Exception {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();

        // When
        String result = secondChallenge.probablyIWillThrowException(1.0, 7.5);

        // When & Then
        assertEquals("Done!", result);
    }

}