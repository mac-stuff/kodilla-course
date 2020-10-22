package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskFactoryTest {

    @Test
    void testFactoryDrivingIsTaskExecuted() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        assertTrue(driving.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingGetTaskName() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        assertEquals("Driving Task", driving.getTaskName());
    }

    @Test
    void testFactoryPaintingIsTaskExecuted() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        painting.executeTask();
        //Then
        assertTrue(painting.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingGetTaskName() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        painting.executeTask();
        //Then
        assertEquals("Painting Task", painting.getTaskName());
    }

    @Test
    void testFactoryShoppingIsTaskExecuted() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        //Then
        assertTrue(shopping.isTaskExecuted());
    }

    @Test
    void testFactoryShoppingGetTaskName() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        //Then
        assertEquals("Shopping Task", shopping.getTaskName());
    }
}
