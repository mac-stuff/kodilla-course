package com.kodilla.rps;

import java.util.Scanner;

import static com.kodilla.rps.Game.*;

public class RpsRunner {

    private static final Scanner scanner = new Scanner(System.in);
    private static boolean end = false;
    private static int roundCounter = 0;
    private static String userName;
    private static String level;
    private static String winner;

    public static void setUserName() {
        System.out.println("★★★ HELLO! ★★★");
        System.out.println("Please enter your name:");
        userName = scanner.nextLine();
    }

    public static void setRoundsNumber() {
        String roundNumber;
        do {
            System.out.println("Please enter number of rounds won for victory (max 5 rounds):");
            roundNumber = scanner.nextLine();
        } while (!roundNumber.equals("1") && !roundNumber.equals("2") && !roundNumber.equals("3") &&
                !roundNumber.equals("4") && !roundNumber.equals("5"));
        roundCounter = Integer.parseInt(roundNumber);
    }

    public static void setLevel() {
        do {
            System.out.println("Please choose level: ");
            System.out.println("\t normal press 1 \n" +
                    "\t simple press 2");
            level = scanner.nextLine();
        } while (!level.equals("1") && !level.equals("2"));
    }

    public static void printWinner() {
        if (winner.equals("user")) {
            System.out.println("★★★ YOU WIN! ★★★ Congratulations!\n\n");
            System.out.println("★★★ GOOD BYE! ★★★");
            end = true;
        } else if (winner.equals("computer")) {
            System.out.println("★★★ COMPUTER WIN! ★★★ Game over!\n\n");
            System.out.println("★★★ GOOD BYE! ★★★");
            end = true;
        } else {
            System.out.println("★★★ DRAW! ★★★ Game over!\n\n");
            System.out.println("★★★ GOOD BYE! ★★★");
            end = true;
        }
    }

    public static void main(String[] args) {
        setUserName();
        setRoundsNumber();
        setLevel();
        while (!end) {
            setUserMove(userName);
            setComputerMove(level);
            setWinner();
            winner = getWinner();
            roundCounter --;
            if (roundCounter == 0) {
                printWinner();
            }
        }
    }
}
