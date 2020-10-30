package com.kodilla.sudoku;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class SudokuGame {

    SudokuBoard sudokuBoard = new SudokuBoard();
    SudokuColumns sudokuColumns = new SudokuColumns();
    SudokuCubes sudokuCubes = new SudokuCubes();
    InputHandling inputHandling = new InputHandling();
    boolean solveSudoku = false;

    boolean resolveSudoku() {

        sudokuColumns.setColumns(sudokuBoard);
        sudokuCubes.setCubes(sudokuBoard);
        System.out.println(sudokuBoard);

        while (!solveSudoku) {

            String choice = inputHandling.getUserChoice();

            if (choice.equals("1")) {
                List<Integer> coordinatesAndValue = inputHandling.getCoordinatesAndValues();

                SudokuElement sudokuElement = sudokuBoard.getSudokuBoard().get(coordinatesAndValue.get(0)).getElements().get(coordinatesAndValue.get(1));

                if (sudokuElement.getValue() == 0) {
                    boolean valueIsCorrect = checkIfCanEnterValue(coordinatesAndValue, sudokuElement);

                    if (valueIsCorrect) {
                        sudokuElement.setValue(coordinatesAndValue.get(2));
                        eliminateValue(coordinatesAndValue, sudokuElement);
                        System.out.println(sudokuBoard);

                    } else {
                        System.out.println("Invalid value. You cannot add this value to field. Try again.");
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

    public boolean checkIfCanEnterValue(List<Integer> coordinatesAndValue, SudokuElement element) {

        int horizontal = coordinatesAndValue.get(0);
        int vertical = coordinatesAndValue.get(1);
        int value = coordinatesAndValue.get(2);

        boolean isCorrect = true;

        SudokuRow sudokuRow = sudokuBoard.getSudokuBoard().get(horizontal);
        for (int i = 0; i < sudokuRow.getElements().size(); i++) {
            if (sudokuRow.getElements().get(i).getValue() == value) {
                isCorrect = false;
                break;
            }
        }

        List<SudokuElement> sudokuColumn = sudokuColumns.getColumns().get(vertical);
        for (SudokuElement sudokuElement : sudokuColumn) {
            if (sudokuElement.getValue() == value) {
                isCorrect = false;
                break;
            }
        }

        int key = getKey(element);

        for (Map.Entry<Integer, List<SudokuElement>> entry : sudokuCubes.getCubes().entrySet()) {
            if (entry.getKey().equals(key)) {
                List<SudokuElement> sudokuCube = sudokuCubes.getCubes().get(key);
                for (SudokuElement sudokuElement : sudokuCube) {
                    if (sudokuElement.getValue() == value) {
                        isCorrect = false;
                        break;
                    }
                }
            }
        }

        return isCorrect;
    }

    public void eliminateValue(List<Integer> coordinatesAndValue, SudokuElement element) {

        int horizontal = coordinatesAndValue.get(0);
        int vertical = coordinatesAndValue.get(1);
        int value = coordinatesAndValue.get(2);

        SudokuRow sudokuRow = sudokuBoard.getSudokuBoard().get(horizontal);
        for (int j = 0; j < sudokuRow.getElements().size(); j++) {
            if (sudokuRow.getElements().get(j).getPossibleValues().contains(value)) {
                sudokuRow.getElements().get(j).getPossibleValues().removeAll(Collections.singletonList(value));
            }
            if (sudokuRow.getElements().get(j).getPossibleValues().size() == 1) {
                sudokuRow.getElements().get(j).setValue(sudokuRow.getElements().get(j).getPossibleValues().get(0));
            }
        }

        List<SudokuElement> sudokuColumn = sudokuColumns.getColumns().get(vertical);
        for (SudokuElement sudokuElement : sudokuColumn) {
            if (sudokuElement.getPossibleValues().contains(value)) {
                sudokuElement.getPossibleValues().removeAll(Collections.singletonList(value));
            }
            if (sudokuElement.getPossibleValues().size() == 1) {
                sudokuElement.setValue(sudokuElement.getPossibleValues().get(0));
            }
        }

        int key = getKey(element);

        for (Map.Entry<Integer, List<SudokuElement>> entry : sudokuCubes.getCubes().entrySet()) {
            if (entry.getKey().equals(key)) {
                List<SudokuElement> sudokuCube = sudokuCubes.getCubes().get(key);
                for (SudokuElement sudokuElement : sudokuCube) {
                    if (sudokuElement.getPossibleValues().contains(value)) {
                        sudokuElement.getPossibleValues().removeAll(Collections.singletonList(value));
                    }
                    if (sudokuElement.getPossibleValues().size() == 1) {
                        sudokuElement.setValue(sudokuElement.getPossibleValues().get(0));
                    }
                }
            }
        }
    }

    private int getKey(SudokuElement element) {
        int key = 10;
        for (Map.Entry<Integer, List<SudokuElement>> entry : sudokuCubes.getCubes().entrySet()) {
            List<SudokuElement> sudokuElements = entry.getValue();
            for (SudokuElement sudokuElement : sudokuElements) {
                if (sudokuElement == element) {
                    key = entry.getKey();
                    break;
                }
            }
        }
        return key;
    }
}

