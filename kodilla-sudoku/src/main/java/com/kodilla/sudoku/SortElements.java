package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortElements {

    private final Map<Integer, List<SudokuElement>> columns = new HashMap<>();
    private final Map<Integer, List<SudokuElement>> cubes = new HashMap<>();

    public Map<Integer, List<SudokuElement>> getColumns() {
        return columns;
    }
    public Map<Integer, List<SudokuElement>> getCubes() {
        return cubes;
    }

    public void setColumns(SudokuBoard sudokuBoard) {
        for (int i = 0; i < sudokuBoard.getSudokuBoard().size(); i++) {
            SudokuRow sudokuRow = sudokuBoard.getSudokuBoard().get(i);
            for (int j = 0; j < sudokuRow.getElements().size(); j++) {
                SudokuElement sudokuElement = sudokuRow.getElements().get(j);
                if (j == 0) {
                    addValue(columns, 0, sudokuElement);
                } else if (j == 1) {
                    addValue(columns, 1, sudokuElement);
                } else if (j == 2) {
                    addValue(columns, 2, sudokuElement);
                } else if (j == 3) {
                    addValue(columns, 3, sudokuElement);
                } else if (j == 4) {
                    addValue(columns, 4, sudokuElement);
                } else if (j == 5) {
                    addValue(columns, 5, sudokuElement);
                } else if (j == 6) {
                    addValue(columns, 6, sudokuElement);
                } else if (j == 7) {
                    addValue(columns, 7, sudokuElement);
                } else if (j == 8) {
                    addValue(columns, 8, sudokuElement);
                }
            }
        }
    }

    public void setCubes(SudokuBoard sudokuBoard) {

        for (int i = 0; i < sudokuBoard.getSudokuBoard().size(); i++) {
            SudokuRow sudokuRow = sudokuBoard.getSudokuBoard().get(i);
            for (int j = 0; j < sudokuRow.getElements().size(); j++) {
                SudokuElement sudokuElement = sudokuRow.getElements().get(j);
                if (j == 0 || j == 1 || j == 2) {
                    if (i == 0 || i == 1 || i == 2) {
                        addValue(cubes, 0, sudokuElement);
                    } else if (i == 3 || i == 4 || i == 5) {
                        addValue(cubes,3, sudokuElement);
                    } else if (i == 6 || i == 7 || i == 8) {
                        addValue(cubes,6, sudokuElement);
                    }
                } else if (j == 3 || j == 4 || j == 5) {
                    if (i == 0 || i == 1 || i == 2) {
                        addValue(cubes,1, sudokuElement);
                    } else if (i == 3 || i == 4 || i == 5) {
                        addValue(cubes,4, sudokuElement);
                    } else if (i == 6 || i == 7 || i == 8) {
                        addValue(cubes,7, sudokuElement);
                    }
                } else if (j == 6 || j == 7 || j == 8) {
                    if (i == 0 || i == 1 || i == 2) {
                        addValue(cubes,2, sudokuElement);
                    } else if (i == 3 || i == 4 || i == 5) {
                        addValue(cubes,5, sudokuElement);
                    } else if (i == 6 || i == 7 || i == 8) {
                        addValue(cubes,8, sudokuElement);
                    }
                }
            }
        }
    }

    private void addValue(Map<Integer, List<SudokuElement>> map, int key, SudokuElement value) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(value);
    }
}
