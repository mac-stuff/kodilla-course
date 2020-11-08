package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {

    private final List<SudokuRow> sudokuBoard = new ArrayList<>();
    private int boardSize;

    public SudokuBoard(int boardSize) {
        this.boardSize = boardSize;
        for (int i = 0; i < boardSize; i++) {
            this.sudokuBoard.add(new SudokuRow(boardSize));
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
            for (int j = 0; j < boardSize; j++) {
                stringBuilder.append(" | ");
                int value = sudokuRow.getElements().get(j).getValue();
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
