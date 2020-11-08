package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {

    private final List<SudokuElement> sudokuRow = new ArrayList<>();

    public SudokuRow(int size) {
        for (int i = 0; i < size; i++) {
            this.sudokuRow.add(new SudokuElement());
        }
    }

    public List<SudokuElement> getElements() {
        return sudokuRow;
    }
}
