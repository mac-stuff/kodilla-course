package com.kodilla.sudoku;

import java.util.List;

public class SudokuGame {

    InputHandling inputHandling = new InputHandling();
    SudokuBoard sudokuBoard = new SudokuBoard();
    boolean solveSudoku = false;

    boolean resolveSudoku() {

        System.out.println(sudokuBoard);

        while (!solveSudoku) {
            String choice = inputHandling.getUserChoice();
            if (choice.equals("1")) {
                List<Integer> coordinatesAndValue = inputHandling.getCoordinatesAndValues();
                sudokuBoard.getSudokuBoard().get(coordinatesAndValue.get(0)).getElements().get(coordinatesAndValue.get(1)).setValue(coordinatesAndValue.get(2));
                System.out.println(sudokuBoard);
            } else {
                solveSudoku = true;
            }
        }
        return !inputHandling.getIsGameFinished().equals("y");
    }
}
