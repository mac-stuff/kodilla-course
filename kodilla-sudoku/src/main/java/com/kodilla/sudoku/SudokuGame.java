package com.kodilla.sudoku;

import java.util.List;

public class SudokuGame {

    SudokuBoard sudokuBoard = new SudokuBoard();
    InputHandling inputHandling = new InputHandling();
    SortElements sortElements = new SortElements();
    SudokuLogic sudokuLogic = new SudokuLogic();
    boolean solveSudoku = false;

    boolean resolveSudoku() {

        sortElements.setColumns(sudokuBoard);
        sortElements.setCubes(sudokuBoard);

        System.out.println(sudokuBoard);

        while (!solveSudoku) {
            String choice = inputHandling.getUserChoice();
            if (choice.equals("1")) {

                List<Integer> coordinatesAndValue = inputHandling.getCoordinatesAndValues();
                SudokuElement element = sudokuBoard.getSudokuBoard().get(coordinatesAndValue.get(0)).getElements().get(coordinatesAndValue.get(1));

                if (element.getElement() == 0) {

                    boolean isCorrect = sudokuLogic.checkIfCanEnterValue(coordinatesAndValue, sudokuBoard,
                            sortElements.getColumns(), sortElements.getCubes(), element);

                    if (isCorrect) {
                        element.setValue(coordinatesAndValue.get(2));
                        System.out.println(sudokuBoard);
                    } else {
                        System.out.println("Invalid value. Try again.");
                    }


                } else {
                    System.out.println("You cannot add value to this field because it is already taken. Try again.");
                }

            } else {
                //sortElements.sortValues(sudokuBoard);
                //Map<Integer, List<SudokuElement>> columns = sortElements.getColumns();
                //Map<Integer, SudokuElement> cube = sortElements.getCube();

                solveSudoku = true;
            }
        }
        return !inputHandling.getIsGameFinished().equals("y");
    }
}
