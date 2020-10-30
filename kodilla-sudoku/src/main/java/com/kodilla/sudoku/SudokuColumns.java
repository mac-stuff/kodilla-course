package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SudokuColumns {

    private final Map<Integer, List<SudokuElement>> columns = new HashMap<>();

    public Map<Integer, List<SudokuElement>> getColumns() {
        return columns;
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

    private void addValue(Map<Integer, List<SudokuElement>> map, int key, SudokuElement value) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(value);
    }
}