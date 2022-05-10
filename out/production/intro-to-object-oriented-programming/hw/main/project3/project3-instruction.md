Project 3
==========

Introduction
------------

This homework will cover Class, Enum, and Inheritance

### Provided File

* Enum
  * Rank
  * Suit
* Class
  * Card
  * Deck
  * Player
  * Game

Problem Description
-------------------

You want to play a card game but do not have money to buy deck of card. Knowing how to code, you decided to create your own card deck to play Black Jack.

Solution Description
--------------------

Write a Java class that, when run plays game of Black Jack.

    100 - 91 | [][][][][][][][][][][][][]
     90 - 81 | [][][][][][][][][][][][][][][][][][][][][][][][][][]
     80 - 71 | [][][][][][][][][][][][][][]
     70 - 61 | [][][][][][][][][][][][][][][][]
     60 - 51 | [][][][][][][][]
     50 - 41 | [][][][][]
     40 - 31 | [][][][][][][]
     30 - 21 | [][]
     20 - 11 |
     10 -  0 | [][]


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

### Input

You will use command-line arguments to inform your program the location of the grades file - _see [Expected Output](https://cs1331.gitlab.io/fall2018/hw1/hw1-histogram.html#expected-output) for how to pass the file name in when running the program_.

You must allow the user to specify the number of bins in the two following ways:

1.  Firstly, the number of bins may be specified as an additional command line arg, e.g. `java Histogram grades.csv 5`
2.  If the second command line arg is not present, your program must ask the user for the number of bins at the beginning.

Expected Output
---------------

Running the program should look like this:

> **Note:** `$` is the command prompt on Unix. On Windows it will look like `C:>`

* Expected Normal Output
    
        $ java BlackJackGame
        What's your name? Jacob
        
        Here's the table:
        House's hand: One face down card and A
        Jacob's hand: A and 10
        
    

**IMPORTANT:** The spacing here is very important. You must use the same spacing scheme as our examples or you will lose points. Also make sure the prompt for the number of bins is the same as our example.

Allowed imports
---------------

You are allowed to import the following classes and only the following classes:

*   java.util.Scanner;
*   java.io.File;
*   Any Exception

Tips
----

1.  You may assume that you always get valid input.
2.  You may assume the text file has valid numbers.
3.  101 is a prime number.
4.  Try using 101 as the number of bins before you submit.
5.  Try using printf.
6.  An array is a fixed size data structure; you need to know ahead of time how big it needs to be. How do we do this?
7.  You can give interpretations to the indices and contents of an array to arrive at creative solutions to problems. Code smart, not hard.
8.  Creating a `Scanner` object with a file will throw a checked exception. Don’t worry about what this means — for now, just append `throws Exception` to the end of the `main` method signature wherein the file is opened.

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