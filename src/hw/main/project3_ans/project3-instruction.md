Project 3
==========

Introduction
------------

This homework will cover Class, Enum, and Inheritance

### Provided File

* Enum
  * Rank
  * Suit
  * PlayerType
* Class
  * Card
  * Deck
  * Player
  * HumanPlayer
  * RandomPlayer
  * Game

Problem Description
-------------------

You want to play a card game but do not have money to buy deck of card. Knowing how to code, you decided to create your own card deck to play Black Jack.

Solution Description
--------------------

Write a Java class that, when run plays game of Black Jack.

    What's your name? Jacob
    Here's the table:
    
    ========================================
    ---------- House's hand: ----------
    One face down card
    TWO of CLUBS
    
    ---------- Jacob's hand: ----------
    EIGHT of HEARTS
    NINE of SPADES
    
    ========================================
    
    What's your move, Jacob? (H for hit, S for stand, then ENTER) H
    ========================================
    ---------- House's hand: ----------
    TWO of HEARTS
    TWO of CLUBS
    
    ---------- Jacob's hand: ----------
    EIGHT of HEARTS
    NINE of SPADES
    SEVEN of SPADES
    
    ========================================
    
    ========================================
    Final Score
    House's score: 4
    Jacob's score: 24
    ========================================
    
    House Wins! Player exceeded 21.


Black Jack
----------------

Black Jack is a card game where player strive to achieve a score of 21 or as close to it is possible

Here is how you play:
1. The dealer will give you two blackjack cards and show one of his cards.
2. You have an option to add more blackjack cards by choosing 'hit', but you lose automatically if your value of cards exceeds 21.
3. Click 'stand' when you are ready to play your hand.
4. The dealer will reveal his hidden blackjack card and must always hit if they have 16 or lower. They will stop hitting if they have 17 or more.
5. You win when the combined value of your cards is greater than that of the dealer. You lose if you have a lower score than the dealer, or if the total of your cards exceeds 21.

### Rules

* Your aim is to get a score of 21 or a higher value than the dealer.
* If your score exceeds 21 then you lose.
* If your score ties with the dealer then you are tied.
* You’re dealt two face-up cards by the dealer.
* The dealer starts with one face-up card and one face-down card.
* Ace is worth 1 or 11 (pending on which value most benefits you).
* Ten, jack, queen, and king are worth 10.
* Two - nine have their face values.
* You hit if you wish to be dealt more cards.
* You stand if you are happy with your two cards.
* The dealer must score at least 17 — they deal themselves more cards if they don’t.


Allowed imports
---------------

You are allowed to import the following classes and only the following classes:

*   java.util.Scanner;
*   java.io.Random;
*   Any Exception

Check Points
-------

*   Scans through the entire file given by the first command line argument once
*   Correct number of bins
*   Correct number of grades in each bin
*   Ranges are correct for each bin
*   Prompts number of bins only when the second command line argument isn’t given
*   Output has correct phrases and spacing

Checkstyle
----------

For each of your homework assignments we will run checkstyle and deduct one point for every checkstyle error.

*   You can run checkstyle on your code by using the jar file. To check the style of your code run `java -jar checkstyle-6.2.2.jar *.java`.
*   To check your Javadocs run `java -jar checkstyle-6.2.2.jar -j *.java`.
*   Note that the command for checking code and the command for checking Javadocs are different. You will have to run both commands to fully test for style errors.
*   Depending on your editor, you might be able to change some settings to make it easier to write style-compliant code. See the [customization tips](http://cs1331.gatech.edu/customization-tips.html) page for more information.


Check Your Answers
----------

*   You can check your answer by running the JUnit Test for your homework.
    

Have fun!
---------