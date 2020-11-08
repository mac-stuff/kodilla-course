package com.kodilla.sudoku;

public class SudokuGame {

    private final SudokuBoard sudokuBoard;
    private final InputHandler inputHandler;
    private SudokuValidator sudokuValidator;
    private final int boxSize;

    public SudokuGame(int boardSize) {
        this.boxSize = (int)Math.sqrt(boardSize);
        sudokuBoard = new SudokuBoard(boardSize);
        inputHandler = new InputHandler(boardSize);
    }

    boolean resolveSudoku() {

        System.out.println(sudokuBoard);

        while (true) {
            ElementParameterDTO elementParameterDTO = inputHandler.getCoordinatesAndValues();

            if (elementParameterDTO == null) {
                if (solveSudoku()) {
                    System.out.println(sudokuBoard);
                    System.out.println("Sudoku has been solved.");
                } else {
                    System.out.println("You added unsolvable sudoku.");
                }
                break;
            }

            if (sudokuBoard.getSudokuBoard().get(elementParameterDTO.getHorizontal()).getElements().get(elementParameterDTO.getVertical()).getValue() == 0) {
                sudokuValidator = new SudokuValidator(boxSize, sudokuBoard, elementParameterDTO.getHorizontal(), elementParameterDTO.getVertical(), elementParameterDTO.getValue());
                if (sudokuValidator.getAreCorrect()) {
                    sudokuBoard.getSudokuBoard().get(elementParameterDTO.getHorizontal()).getElements().get(elementParameterDTO.getVertical()).setValue(elementParameterDTO.getValue());
                    System.out.println(sudokuBoard);
                } else {
                    System.out.println("Invalid value. You cannot add this value to field. Try again.");
                }
            } else {
                System.out.println("You cannot add value to this field because it is already taken. Try again.");
            }
        }
        return !inputHandler.isGameFinished().equals("y");
    }

    public boolean solveSudoku() {

        for (int row = 0; row < sudokuBoard.getSudokuBoard().size(); row++) {
            SudokuRow sudokuRow = sudokuBoard.getSudokuBoard().get(row);
            for (int column = 0; column < sudokuRow.getElements().size(); column++) {
                SudokuElement sudokuElement = sudokuRow.getElements().get(column);
                if (sudokuElement.getValue() == 0) {
                    for (int number = 1; number < 10; number++) {
                        sudokuValidator = new SudokuValidator(boxSize, sudokuBoard, row, column, number);
                        if (sudokuValidator.getAreCorrect()) {
                            sudokuBoard.getSudokuBoard().get(row).getElements().get(column).setValue(number);
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
