package com.kodilla.sudoku;

public class SudokuElement {

    private int value = 0;

    public void setValue(int value) {
        this.value = value;
    }

    public int getElement() {
        return value;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
