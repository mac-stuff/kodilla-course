package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SudokuElement {

    private static int EMPTY = -1;
    private int value = EMPTY;
    //private List<Integer> values = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
