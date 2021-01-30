package com.kodilla.patterns2.observer.homework;

public class Task {

    private String title;
    private String task;

    public Task(String title, String task) {
        this.title = title;
        this.task = task;
    }

    public String getTitle() {
        return title;
    }

    public String getTask() {
        return task;
    }
}
