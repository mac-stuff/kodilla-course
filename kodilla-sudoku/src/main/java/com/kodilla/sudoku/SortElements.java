package com.kodilla.sudoku;

import java.util.HashMap;
import java.util.Map;

public class SortElements {

    private final Map<Integer, SudokuElement> columns = new HashMap<>();
    private final Map<Integer, SudokuElement> cube = new HashMap<>();

    public Map<Integer, SudokuElement> getColumns() {
        return columns;
    }

    public Map<Integer, SudokuElement> getCube() {
        return cube;
    }

    public void sortValues(SudokuBoard sudokuBoard) {

        for (int i = 0; i < sudokuBoard.getSudokuBoard().size(); i++) {
            SudokuRow sudokuRow = sudokuBoard.getSudokuBoard().get(i);
            for (int j = 0; j < sudokuRow.getElements().size(); j++) {
                SudokuElement sudokuElement = sudokuRow.getElements().get(j);
                switch (j) {
                    case 0:
                        columns.put(1, sudokuElement);
                    case 1:
                        columns.put(2, sudokuElement);
                    case 2:
                        columns.put(3, sudokuElement);
                    case 3:
                        columns.put(4, sudokuElement);
                    case 4:
                        columns.put(5, sudokuElement);
                    case 5:
                        columns.put(6, sudokuElement);
                    case 6:
                        columns.put(7, sudokuElement);
                    case 7:
                        columns.put(8, sudokuElement);
                    case 8:
                        columns.put(9, sudokuElement);
                }
            }
        }

        for (int i = 0; i < sudokuBoard.getSudokuBoard().size(); i++) {
            SudokuRow sudokuRow = sudokuBoard.getSudokuBoard().get(i);
            for (int j = 0; j < sudokuRow.getElements().size(); j++) {
                SudokuElement sudokuElement = sudokuRow.getElements().get(j);
                if (j == 0 || j == 1 || j == 2) {
                    if (i == 0 || i == 1 || i == 2) {
                        cube.put(1, sudokuElement);
                    } else if (i == 3 || i == 4 || i == 5) {
                        cube.put(4, sudokuElement);
                    } else if (i == 6 || i == 7 || i == 8) {
                        cube.put(7, sudokuElement);
                    }
                } else if (j == 3 || j == 4 || j == 5) {
                    if (i == 0 || i == 1 || i == 2) {
                        cube.put(2, sudokuElement);
                    } else if (i == 3 || i == 4 || i == 5) {
                        cube.put(5, sudokuElement);
                    } else if (i == 6 || i == 7 || i == 8) {
                        cube.put(8, sudokuElement);
                    }
                } else if (j == 6 || j == 7 || j == 8) {
                    if (i == 0 || i == 1 || i == 2) {
                        cube.put(3, sudokuElement);
                    } else if (i == 3 || i == 4 || i == 5) {
                        cube.put(6, sudokuElement);
                    } else if (i == 6 || i == 7 || i == 8) {
                        cube.put(9, sudokuElement);
                    }
                }
            }
        }
    }
}
