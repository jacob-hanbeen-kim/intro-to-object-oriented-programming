package hw.main.project3;

import java.util.Random;

public class Deck {

    private Card[] cards;
    private int topCard;

    public Deck() {
        this.cards = new Card[52];
        this.topCard = 51;
        int cardNumber = 0;
        for (Suit suit: Suit.values()) {
            for (Rank rank: Rank.values()) {
                this.cards[cardNumber] = new Card(rank, suit);
                cardNumber++;
            }
        }
    }

    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int card1 = rand.nextInt(this.topCard + 1);
            int card2 = rand.nextInt(this.topCard + 1);
            swap(card1, card2);
        }
    }

    private void swap(int card1, int card2) {
        Card tmp = this.cards[card1];
        this.cards[card1] = this.cards[card2];
        this.cards[card2] = tmp;
    }

    public Card draw() {
        topCard--;
        assert(topCard >= -1);
        return cards[topCard + 1];
    }

    public boolean hasCards() {
        return topCard >= 0;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <= topCard; ++i) {
            sb.append(cards[i].toString()
                    + System.getProperty("line.separator"));
        }
        return sb.toString();
    }


}
