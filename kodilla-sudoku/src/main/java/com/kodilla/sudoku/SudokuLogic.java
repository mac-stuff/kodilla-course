package com.kodilla.sudoku;

import java.util.List;
import java.util.Map;

public class SudokuLogic {


    public boolean checkIfCanEnterValue(List<Integer> coordinatesAndValue, SudokuBoard sudokuBoard,
                                        Map<Integer, List<SudokuElement>> columns, Map<Integer, List<SudokuElement>> cube, SudokuElement element) {

        int horizontal = coordinatesAndValue.get(0);
        int vertical = coordinatesAndValue.get(1);
        int value = coordinatesAndValue.get(2);

        boolean isCorrect= true;

        SudokuRow sudokuRow = sudokuBoard.getSudokuBoard().get(horizontal);
        for (int j = 0; j < sudokuRow.getElements().size(); j++) {
            if (sudokuRow.getElements().get(j).getElement() == value) {
                isCorrect= false;
                break;
            }
        }

        for (Integer key : columns.keySet()) {
            if (key == vertical) {
                List<SudokuElement> values = columns.get(vertical);
                for (SudokuElement e : values) {
                    if (e.getElement() == value) {
                        isCorrect= false;
                        break;
                    }
                }
            }
        }

        int key = 10;
        for (Map.Entry<Integer, List<SudokuElement>> entry : cube.entrySet()) {
            List<SudokuElement> sudokuElements = entry.getValue();
            for (SudokuElement sudokuElement : sudokuElements) {
                if (sudokuElement == element) {
                    key = entry.getKey();
                    break;
                }
            }
        }

        for (Map.Entry<Integer, List<SudokuElement>> entry : cube.entrySet()) {
            if (entry.getKey().equals(key)) {
                List<SudokuElement> sudokuElements = cube.get(key);
                for (SudokuElement sudokuElement : sudokuElements) {
                    if (sudokuElement.getElement() == value) {
                        isCorrect= false;
                        break;
                    }
                }
            }
        }

        return isCorrect;
    }
}
