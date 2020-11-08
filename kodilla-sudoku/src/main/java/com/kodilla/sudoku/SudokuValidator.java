package com.kodilla.sudoku;

public class SudokuValidator {

    private final boolean areCorrect;
    private final int boxSize;

    public SudokuValidator(int boxSize, SudokuBoard sudokuBoard, int row, int column, int number) {
        this.boxSize = boxSize;
        areCorrect = areCorrect(sudokuBoard, row, column, number);
    }

    public boolean getAreCorrect() {
        return this.areCorrect;
    }

    private boolean areCorrect(SudokuBoard sudokuBoard, int row, int column, int number) {
        return !isInRow(sudokuBoard, row, number) && !isInColumn(sudokuBoard, column, number) && !isInBox(sudokuBoard, row, column, number);
    }

    private boolean isInRow(SudokuBoard sudokuBoard, int row, int number) {
        for (int i = 0; i < sudokuBoard.getSudokuBoard().size(); i++) {
            if (sudokuBoard.getSudokuBoard().get(row).getElements().get(i).getValue() == number) {
                return true;
            }
        }
        return false;
    }

    private boolean isInColumn(SudokuBoard sudokuBoard, int column, int number) {
        for (int i = 0; i < sudokuBoard.getSudokuBoard().size(); i++) {
            if (sudokuBoard.getSudokuBoard().get(i).getElements().get(column).getValue() == number) {
                return true;
            }
        }
        return false;
    }

    private boolean isInBox(SudokuBoard sudokuBoard, int row, int column, int number) {

        int horizontal = row - row % boxSize;
        int vertical = column - column % boxSize;

        for (int i = horizontal; i < horizontal + boxSize; i++) {
            for (int j = vertical; j < vertical + boxSize; j++) {
                if (sudokuBoard.getSudokuBoard().get(i).getElements().get(j).getValue() == number) {
                    return true;
                }
            }
        }
        return false;
    }
}
