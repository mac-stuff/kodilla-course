package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeCollector = new ArrayList<>();

    public void addFigure(Shape shape) {
        this.shapeCollector.add(shape);
    }

    public void removeFigure(Shape shape) {
        this.shapeCollector.remove(shape);
    }

    public Object getFigure(int n) {
        return this.shapeCollector.get(n);
    }

    public String showFigures() {
        String figures = new String();
        for (int i = 0; i < this.shapeCollector.size(); i++) {
            figures += (this.shapeCollector.get(i).getShapeName() + ", ");
        }
        return figures;
    }
}
