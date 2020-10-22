package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {

        return switch (taskClass) {
            case DRIVING -> new DrivingTask("Driving Task", "Company", "Car");
            case PAINTING -> new PaintingTask("Painting Task", "Red", "Conference room");
            case SHOPPING -> new ShoppingTask("Shopping Task", "Business cards", 140.00);
            default -> null;
        };
    }
}
