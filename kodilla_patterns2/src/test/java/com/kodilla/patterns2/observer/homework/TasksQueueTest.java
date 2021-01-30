package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TasksQueueTest {

    @Test
    public void testUpdate() {
        // Given
        TasksQueue tasksQueue = new TasksQueue();
        ObserverService mentorJohnSmith = new ObserverService("John Smith");
        ObserverService mentorIvonneEscobar= new ObserverService("Ivonne Escobar");
        ObserverService mentorJessieLinkman = new ObserverService("Jessie Linkman");
        tasksQueue.registerObserver(mentorJohnSmith);
        tasksQueue.registerObserver(mentorIvonneEscobar);
        tasksQueue.registerObserver(mentorJessieLinkman);

        // When
        tasksQueue.addTask(new Task("Java Task 1", "Test task content"));
        tasksQueue.addTask(new Task("Java Task 2", "Test task content"));
        tasksQueue.addTask(new Task("Java Task 3", "Test task content"));

        // Then
        assertEquals(3, mentorJohnSmith.getUpdateCount());
    }
}