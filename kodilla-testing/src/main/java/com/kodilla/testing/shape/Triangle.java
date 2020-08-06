package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String shapeName = "Triangle";
    private int base;
    private int height;
    private double field;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public void setField() {
        this.field = this.base * this.height * 0.5;
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