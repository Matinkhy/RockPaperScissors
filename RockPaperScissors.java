package com.mycompany.rockpaperscissors;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    static Random rand;
    static Scanner scan;

    public static void main(String[] args) {
        rand = new Random();
        scan = new Scanner(System.in);
        String yourPick;
        int yourPickNum = 0, yourScore = 0;
        int programsPick, programsScore = 0;
        while (true) {
            boolean execute = true;
            System.out.println("Lets play rock, paper, scissors! What do you pick? (Enter \"stop\" to stop)");
            yourPick = scan.next();
            if (yourPick.equalsIgnoreCase("stop")) {
                System.out.println("Thank you for playing");
                break;
            } else if (yourPick.charAt(0) == 'r' || yourPick.charAt(0) == 'R') {
                System.out.println("\nYou picked rock");
                yourPickNum = 0;
            } else if (yourPick.charAt(0) == 'p' || yourPick.charAt(0) == 'P') {
                System.out.println("\nYou picked paper");
                yourPickNum = 1;
            } else if (yourPick.charAt(0) == 's' || yourPick.charAt(0) == 'S') {
                yourPickNum = 2;
                System.out.println("\nYou picked scissors");
            } else {
                System.out.println("Invalid response, type \"Stop\" to stop");
                execute = false;
            }
            if (execute) {
                programsPick = rand.nextInt(3);
                switch (programsPick) {
                    case 0 ->
                        System.out.println("I pick rock\n");
                    case 1 ->
                        System.out.println("I pick paper\n");
                    case 2 ->
                        System.out.println("I pick Scissors\n");
                }

                if (yourPickNum == programsPick) {
                    System.out.println("Its a tie");
                } else if (yourPickNum == 0 && programsPick == 1) {
                    System.out.println("I win!\n");
                    programsScore++;
                } else if (yourPickNum == 0 && programsPick == 2) {
                    System.out.println("Oh no! You win.\n");
                    yourScore++;
                } else if (yourPickNum == 1 && programsPick == 0) {
                    System.out.println("I win!\n");
                    programsScore++;
                } else if (yourPickNum == 1 && programsPick == 2) {
                    System.out.println("Oh no! You win.\n");
                    yourScore++;
                } else if (yourPickNum == 2 && programsPick == 0) {
                    System.out.println("I win!\n");
                    programsScore++;
                } else if (yourPickNum == 2 && programsPick == 1) {
                    System.out.println("Oh no! You win.\n");
                    yourScore++;
                }

                System.out.println("Thank you for playing! Your score is " + yourScore + " and my score is " + programsScore);

                if (yourScore > programsScore) {
                    System.out.println("You win by " + (yourScore - programsScore) + " points!");
                } else if (yourScore == programsScore) {
                    System.out.println("Its a tie, we both got " + yourScore + " points!");
                } else {
                    System.out.println("I win by " + (programsScore - yourScore) + " points!");
                }
            } else {
                System.out.println("Come back and play another time :)" );
            }
        }

    }
}
