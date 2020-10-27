package com.kodilla.sudoku;

import java.util.List;

public class SudokuGame {

    Communicator communicator = new Communicator();
    SudokuBoard sudokuBoard = new SudokuBoard();

    boolean resolveSudoku() {
        System.out.println(sudokuBoard);

        List<Integer> sudokuValues = communicator.inputSudokuValues();
        int horizontal = sudokuValues.get(0);
        int vertical = sudokuValues.get(1);
        int value = sudokuValues.get(2);

        sudokuBoard.getSudokuBoard().get(horizontal).getElements().get(vertical).setValue(value);
        System.out.println(sudokuBoard);

        return communicator.inputIsGameFinished().equals("y");
    }
}
