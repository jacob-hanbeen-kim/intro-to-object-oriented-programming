package hw.main.project3;

import java.util.Scanner;

public class Game {
    private static void printHands(Player... players) {
        System.out.println("========================================");
        for (Player player: players) {
            System.out.println("---------- " + player.getName() + "'s hand: ----------" + player.getHand());
        }
        System.out.println("========================================");
        System.out.println();
    }

    private static void showHands(Player... players) {
        System.out.println("========================================");
        for (Player player: players) {
            System.out.println("---------- " + player.getName() + "'s hand: ----------" + player.getHand().show());
        }
        System.out.println("========================================");
        System.out.println();
    }

    private static void showScores(Player... players) {
        System.out.println("========================================");
        System.out.println("Final Score");
        for (Player player: players) {
            System.out.println(player.getName() + "'s score: " + player.getHand().value());
        }
        System.out.println("========================================");
        System.out.println();
    }

    public static void main(String[] args) {

        // TODO: Initialize House Player

        // TODO: Take in Human Player Name

        // TODO: Initialize Human Player

        // TODO: Initialize Deck and shuffle

        // TODO: Deal two cards to each players

        boolean shouldKeepPlaying = true;
        while (shouldKeepPlaying) {
            // TODO: Print Hands

            // TODO: Get Human Player Move and Deal card if needed

            // TODO: Get House Player Move and Deal card if needed

            // TODO: Check if either player exceeded value 21
        }

        // TODO: Show Hands and Scores

        // TODO: Check Winning Conditions

    }
}
