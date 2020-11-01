package com.kodilla.sudoku;

import java.util.*;

public class SudokuGame {

    SudokuBoard sudokuBoard = new SudokuBoard();
    InputHandling inputHandling = new InputHandling();

    boolean resolveSudoku() {

        System.out.println(sudokuBoard);

        while (true) {
            List<Integer> coordinatesAndValue = inputHandling.getCoordinatesAndValues();

            if (coordinatesAndValue.isEmpty()) {
                if (solveSudoku()) {
                    System.out.println("Sudoku has been solved.");
                } else {
                    System.out.println("You added unsolvable sudoku.");
                }
                break;
            }

            if (sudokuBoard.getSudokuBoard().get(coordinatesAndValue.get(0)).getElements().get(coordinatesAndValue.get(1)).getValue() == 0) {
                if (areCorrect(coordinatesAndValue.get(0), coordinatesAndValue.get(1), coordinatesAndValue.get(2))) {
                    sudokuBoard.getSudokuBoard().get(coordinatesAndValue.get(0)).getElements().get(coordinatesAndValue.get(1)).setValue(coordinatesAndValue.get(2));
                    System.out.println(sudokuBoard);
                } else {
                    System.out.println("Invalid value. You cannot add this value to field. Try again.");
                }
            } else {
                System.out.println("You cannot add value to this field because it is already taken. Try again.");
            }
        }
        return !inputHandling.isGameFinished().equals("y");
    }

    private boolean areCorrect(int row, int column, int number) {
        return !isInRow(row, number) && !isInColumn(column, number) && !isInBox(row, column, number);
    }

    private boolean isInRow(int row, int number) {
        for (int i = 0; i < sudokuBoard.getSudokuBoard().size(); i++) {
            if (sudokuBoard.getSudokuBoard().get(row).getElements().get(i).getValue() == number) {
                return true;
            }
        }
        return false;
    }

    private boolean isInColumn(int column, int number) {
        for (int i = 0; i < sudokuBoard.getSudokuBoard().size(); i++) {
            if (sudokuBoard.getSudokuBoard().get(i).getElements().get(column).getValue() == number) {
                return true;
            }
        }
        return false;
    }

    private boolean isInBox(int row, int column, int number) {

        int horizontal = row - row % 3;
        int vertical = column - column % 3;

        for (int i = horizontal; i < horizontal + 3; i++) {
            for (int j = vertical; j < vertical + 3; j++) {
                if (sudokuBoard.getSudokuBoard().get(i).getElements().get(j).getValue() == number) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean solveSudoku() {

        for (int row = 0; row < sudokuBoard.getSudokuBoard().size(); row++) {
            SudokuRow sudokuRow = sudokuBoard.getSudokuBoard().get(row);
            for (int column = 0; column < sudokuRow.getElements().size(); column++) {
                SudokuElement sudokuElement = sudokuRow.getElements().get(column);
                if (sudokuElement.getValue() == 0) {
                    for (int number = 1; number < 10; number++) {
                        if (areCorrect(row, column, number)) {
                            sudokuBoard.getSudokuBoard().get(row).getElements().get(column).setValue(number);
                            System.out.println(sudokuBoard);
                            if (solveSudoku()) {
                                return true;
                            } else {
                                sudokuBoard.getSudokuBoard().get(row).getElements().get(column).setValue(0);
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
