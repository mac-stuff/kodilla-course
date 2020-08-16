package com.kodilla.rps;

import java.util.Scanner;

import static com.kodilla.rps.Game.*;

public class RpsRunner {

    private static boolean end = false;
    private static String level = "1";

    public static void setLevel() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please choose level: ");
            System.out.println("\t normal press 1 \n" +
                    "\t simple press 2");
            level = scanner.nextLine();
        } while (!level.equals("1") && !level.equals("2"));
    }

    public static void setEnd() {
        System.out.println("To play again press 1, to exit press any else key. \n" +
                "Please enter your choice:");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (!answer.equals("1")) {
            System.out.println("★★★ GOOD BYE! ★★★");
            end = true;
        }
    }

    public static void main(String[] args) {
        System.out.println("★★★ HELLO! ★★★");
        while (!end) {
            setLevel();
            setUserMove();
            setComputerMove(level);
            setWinner();
            printWinner();
            setEnd();
        }
    }
}
