package hw.main.project3;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Random;

public class Deck {

    private Card[] cards;
    private int topCard;

    public Deck() {
        // #TODO: Initialize fields

        // #TODO: Populate cards array with values
    }

    /**
     * Shuffles the card randomly
     */
    public void shuffle() {
        // #TODO: implement method using swap method provided below
    }

    /**
     * swaps placement of card1 and card2 in cards array
     * @param card1
     * @param card2
     */
    private void swap(int card1, int card2) {
        Card tmp = this.cards[card1];
        this.cards[card1] = this.cards[card2];
        this.cards[card2] = tmp;
    }

    /**
     * draw topCard in cards array
     * @return
     */
    public Card draw() {
        // #TODO: implement draw function
        throw new NotImplementedException();
    }

    public boolean hasCards() {
        return topCard >= 0;
    }

    /**
     * Prints Card to Console
     * @return
     */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <= topCard; ++i) {
            sb.append(cards[i].toString()
                    + System.getProperty("line.separator"));
        }
        return sb.toString();
    }


}
