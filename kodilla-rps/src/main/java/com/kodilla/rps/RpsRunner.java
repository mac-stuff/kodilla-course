package com.kodilla.rps;

import java.util.Scanner;

import static com.kodilla.rps.Game.*;

public class RpsRunner {

    private static final Scanner scanner = new Scanner(System.in);
    private static String gameLevel;
    private static String userName;
    private static int roundCounter = 0;
    private static String winner;
    private static boolean end = false;

    public static void setGameLevel() {
        System.out.println("★★★ HELLO! ★★★");
        do {
            System.out.println("Please choose game level: ");
            System.out.println("\t for normal press 1 \n" +
                    "\t for simple press 2");
            gameLevel = scanner.nextLine();
        } while (!gameLevel.equals("1") && !gameLevel.equals("2"));
    }

    public static void setUserName() {
        System.out.println("Please enter your name:");
        userName = scanner.nextLine();
    }

    public static void setRoundsNumber() {
        String roundNumber;
        do {
            System.out.println("Please choose number of rounds won for victory (max 5 rounds):");
            roundNumber = scanner.nextLine();
        } while (!roundNumber.equals("1") && !roundNumber.equals("2") && !roundNumber.equals("3") &&
                !roundNumber.equals("4") && !roundNumber.equals("5"));
        roundCounter = Integer.parseInt(roundNumber);
    }

    public static void printWinner() {
        if (winner.equals("user")) {
            System.out.println("★★★ YOU WIN GAME! ★★★ Congratulations!\n");
        } else if (winner.equals("computer")) {
            System.out.println("★★★ COMPUTER WIN GAME! ★★★ Game over!\n");
        } else {
            System.out.println("★★★ DRAW! ★★★ Game over!\n");
        }
        System.out.println("★★★ GOOD BYE! ★★★");
        end = true;
    }

    public static void main(String[] args) {
        setGameLevel();
        setUserName();
        setRoundsNumber();
        while (!end) {
            setUserMove(userName);
            boolean wantPlay = checkIfWantToPlay();
            if (wantPlay) {
                setComputerMove(gameLevel);
                setWinner();
                roundCounter--;
                if (roundCounter == 0) {
                    winner = getWinner();
                    printWinner();
                }
            } else {
                System.out.println("★★★ GOOD BYE! ★★★");
                end = true;
            }
        }
    }
}
