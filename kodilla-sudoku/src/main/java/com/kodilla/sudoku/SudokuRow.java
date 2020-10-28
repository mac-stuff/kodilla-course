package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {

    private final List<SudokuElement> sudokuRow = new ArrayList<>();

    public SudokuRow() {
        for (int i = 0; i < 9; i++) {
            this.sudokuRow.add(new SudokuElement());
        }
    }

    public List<SudokuElement> getElements() {
        return sudokuRow;
    }
}
