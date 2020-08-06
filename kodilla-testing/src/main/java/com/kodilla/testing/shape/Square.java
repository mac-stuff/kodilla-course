package com.kodilla.testing.shape;

public class Square implements Shape {

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
