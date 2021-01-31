package com.kodilla.patterns2.observer.homework;

public class ObserverService implements Observer {

    private final String mentorName;
    private int updateCount;

    public ObserverService(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(TasksQueue tasksQueue) {
        updateCount++;
        System.out.println("Hi, " + mentorName + " - student added new task in: " +
                tasksQueue.getName() + "(total in queue: " + tasksQueue.getTasks().size() + " tasks)\n");
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
