package com.kodilla.testing.shape;

public class Square implements Shape {

    private String shapeName = "Square";
    private int side;
    private double field;

    public Square(int side) {
        this.side = side;
    }

    public void setField() {
        this.field = this.side * 4;
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
