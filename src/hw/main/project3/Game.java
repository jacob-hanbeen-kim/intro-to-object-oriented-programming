package hw.main.project3;

import java.util.Scanner;

public class Game {
    private static void printHands(Player ... players) {
        System.out.println("========================================");
        for (Player player: players) {
            System.out.println("---------- " + player.getName() + "'s hand: ----------" + player.getHand());
        }
        System.out.println("========================================");
        System.out.println();
    }

    private static void showHands(Player ... players) {
        System.out.println("========================================");
        for (Player player: players) {
            System.out.println("---------- " + player.getName() + "'s hand: ----------" + player.getHand().show());
        }
        System.out.println("========================================");
        System.out.println();
    }

    private static void showScores(Player ... players) {
        System.out.println("========================================");
        System.out.println("Final Score");
        for (Player player: players) {
            System.out.println(player.getName() + "'s score: " + player.getHand().value());
        }
        System.out.println("========================================");
        System.out.println();
    }

    public static void main(String[] args) {
        Player house = new RandomPlayer("House");

        Scanner kbd = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = kbd.nextLine();
        Player player = new HumanPlayer(name);

        Deck deck = new Deck();
        deck.shuffle();

        house.dealFaceDown(deck.draw());
        player.dealFaceUp(deck.draw());
        house.dealFaceUp(deck.draw());
        player.dealFaceUp(deck.draw());

        boolean shouldKeepPlaying = true;
        while (shouldKeepPlaying) {
            System.out.println("Here's the table: \n");
            printHands(house, player);
            Player.Move playerMove = player.getMove(house.getHand());
            if (playerMove == Player.Move.HIT) {
                player.dealFaceUp(deck.draw());
            } else {
                shouldKeepPlaying = false;
            }
            Player.Move houseMove = house.getMove(player.getHand());
            if (houseMove == Player.Move.HIT) {
                house.dealFaceUp(deck.draw());
            }

            if (player.getHand().value() > 21 || house.getHand().value() > 21) {
                shouldKeepPlaying = false;
            }
        }

        showHands(house, player);

        showScores(house, player);

        if (player.getHand().value() > 21) {
            System.out.println("House Wins! Player exceeded 21.");
        } else if (house.getHand().value() > 21) {
            System.out.println("Player wins! House exceeded 21.");
        } else if (player.getHand().compareTo(house.getHand()) > 0) {
            System.out.println("Player wins.");
        } else if (player.getHand().compareTo(house.getHand()) < 0) {
            System.out.println("House wins.");
        } else {
            System.out.println("Tie.");
        }
    }
}
