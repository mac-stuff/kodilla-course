package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {

    private final List<SudokuRow> sudokuBoard = new ArrayList<>();

    public SudokuBoard() {
        for (int i = 0; i < 9; i++) {
            this.sudokuBoard.add(new SudokuRow());
        }
    }

    public List<SudokuRow> getSudokuBoard() {
        return sudokuBoard;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n *--------------*--------------*--------------*\n");
        for (SudokuRow sudokuRow : sudokuBoard) {
            for (int j = 0; j < 9; j++) {
                stringBuilder.append(" | ");
                int value = sudokuRow.getElements().get(j).getElement();
                if (value != 0) {
                    stringBuilder.append(value).append(" ");
                } else {
                    stringBuilder.append("  ");
                }
            }
            stringBuilder.append(" |\n");
            stringBuilder.append(" *--------------*--------------*--------------*\n");
        }
        return stringBuilder.toString();
    }
}
