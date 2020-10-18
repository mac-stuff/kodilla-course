package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardTest {

    @Test
    void testTaskAdd() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        List<String> toDoExpected = new ArrayList<>(Arrays.asList("do shopping", "dentist"));
        List<String> inProgressExpected = new ArrayList<>(Arrays.asList("yoga class", "visit grandma"));
        List<String> doneExpected = new ArrayList<>(Arrays.asList("buy a camera", "make photo sessions"));

        // When
        TaskList toDo = context.getBean("toDo", TaskList.class);
        toDo.tasks = new ArrayList<>(Arrays.asList("do shopping", "dentist"));

        TaskList inProgress = context.getBean("inProgress", TaskList.class);
        inProgress.tasks = new ArrayList<>(Arrays.asList("yoga class", "visit grandma"));

        TaskList done = context.getBean("done", TaskList.class);
        done.tasks = new ArrayList<>(Arrays.asList("buy a camera", "make photo sessions"));

        // Then
        assertEquals(toDoExpected.get(0), toDo.tasks.get(0));
        assertEquals(inProgressExpected.get(1), inProgress.tasks.get(1));
        assertEquals(doneExpected.get(0), done.tasks.get(0));
    }
}