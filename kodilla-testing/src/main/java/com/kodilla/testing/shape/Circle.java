package com.kodilla.testing.shape;

public class Circle implements Shape {

    private String shapeName = "Circle";
    private int radius;
    private double field;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void setField() {
        this.field = this.radius * this.radius * 3.14;
    }

    @Override
    public String getShapeName() {
        return this.shapeName;
    }

    @Override
    public double getField() {
        return this.field;
    }
}
