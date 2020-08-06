package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String shapeName;
    private double field;


    @Override
    public String getShapeName() {
        return this.shapeName;
    }

    @Override
    public double getField() {
        return this.field;
    }
}