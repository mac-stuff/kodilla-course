package com.kodilla.sudoku;

public class ElementParameterDTO {

    private static final int OFFSET = 1;
    private final int horizontal;
    private final int vertical;
    private final int value;

    public ElementParameterDTO(String horizontal, String vertical, String value) {
        this.horizontal = setCoordinate(horizontal);
        this.vertical = setCoordinate(vertical);
        this.value = Integer.parseInt(value);
    }

    public int getHorizontal() {
        return horizontal;
    }

    public int getVertical() {
        return vertical;
    }

    public int getValue() {
        return value;
    }

    private int setCoordinate(String index) {
        return Integer.parseInt(index) - OFFSET;
    }
}
