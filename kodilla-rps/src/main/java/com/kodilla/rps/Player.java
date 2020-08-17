package com.kodilla.rps;

public class Player {

    private final String name;
    private final String choice;
    private String shapeOrExit;

    public Player(String name, String choice) {
        this.name = name;
        this.choice = choice;
        setShapeOrExit();
    }

    private void setShapeOrExit() {
        switch (choice) {
            case "1" -> this.shapeOrExit = "scissors";
            case "2" -> this.shapeOrExit = "paper";
            case "3" -> this.shapeOrExit = "rock";
            case "x" -> this.shapeOrExit = "exit";
        }
    }

    public String getChoice() {
        return choice;
    }

    public String printMessage() {
        return name.toUpperCase() + " choose " + shapeOrExit.toUpperCase();
    }
}
