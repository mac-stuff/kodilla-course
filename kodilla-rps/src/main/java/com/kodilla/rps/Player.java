package com.kodilla.rps;

public class Player {

    private final String name;
    private final String choice;
    private String shape;

    public Player(String name, String choice) {
        this.name = name;
        this.choice = choice;
        setShape();
    }

    public void setShape() {
        if (choice.equals("1")) {
            this.shape = "scissors";
        } else if (choice.equals("2")) {
            this.shape = "paper";
        } else {
            this.shape = "rock";
        }
    }

    public String getChoice() {
        return choice;
    }

    public String printMessage() {
        return name.toUpperCase() + " choose " + shape.toUpperCase();
    }
}
