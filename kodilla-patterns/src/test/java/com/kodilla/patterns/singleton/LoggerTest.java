package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTest {

    private static Logger logger;

    @BeforeAll
    public static void openSettingsFileAndAddLog() {
        logger = Logger.INSTANCE;
        logger.open("myapp.settings");
        logger.log("Test log.");
    }

    @AfterAll
    public static void closeSettingsFile() {
        logger.close();
    }

    @Test
    void testGetLastLog() {
        //When
        String lastLog = logger.getLastLog();
        //Then
        assertEquals("Test log.", lastLog);
    }
}