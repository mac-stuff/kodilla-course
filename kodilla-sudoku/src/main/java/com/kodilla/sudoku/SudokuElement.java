package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SudokuElement {

    private int value = 0;
    List<Integer> possibleValues = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

    public void setValue(int value) {
        this.value = value;
        possibleValues.remove(value);
    }

    public int getElement() {
        return value;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
