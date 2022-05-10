package hw.main.project3;

public class BlackjackHand implements Comparable {

    private Card faceDownCard;
    private Card[] faceUpCards;
    private int lastFaceUpCard;
    private PlayerType playerType;

    public BlackjackHand(PlayerType playerType) {
        this.faceUpCards = new Card[10];
        this.playerType = playerType;
        int lastFaceUpCard = -1;
    }

    /**
     * Adds face down card for non-human players
     * @param card
     */
    public void addFaceDown(Card card) {
        this.faceDownCard = card;
    }

    /**
     * Adds face up card
     * if non-human player, must have faceDownCard already set
     * @param card
     */
    public void addFaceUp(Card card) {
        if (playerType != PlayerType.HUMAN && this.faceDownCard == null) {
            System.out.println("Can't add a face up card before adding a "+
                    "face down card.  Hand still empty.");
        } else {
            this.faceUpCards[this.lastFaceUpCard++] = card;
        }
    }

    /**
     * returns current player's hand value
     * @return
     */
    public int value() {
        int value = 0;
        if (this.playerType != PlayerType.HUMAN) {
            if (this.faceDownCard == null) return 0;
            value += cardValue(this.faceDownCard);
        }

        for (int i = 0; i < this.lastFaceUpCard; ++i) {
            value += cardValue(this.faceUpCards[i]);
        }

        int acesRemaining = countAces();
        while ((value > 21) && (acesRemaining > 0)) {
            value -= 10;
            acesRemaining--;
        }
        return value;
    }

    /**
     * return single card value
     * @param card
     * @return
     */
    private int cardValue(Card card) {
        if (card.getRank() == Rank.JACK
                || card.getRank() == Rank.QUEEN
                || card.getRank() == Rank.KING) {
            return 10;
        } else if (card.getRank() == Rank.ACE) {
            return 11;
        } else {
            return card.getRank().ordinal() + 2;
        }
    }

    /**
     * Counts aces in hand
     * @return
     */
    private int countAces() {
        int count = 0;
        if (playerType != PlayerType.HUMAN) {
            count = (this.faceDownCard.getRank() == Rank.ACE) ? 1 : 0;
        }

        for (int i = 0; i < this.lastFaceUpCard; ++i) {
            if (this.faceUpCards[i].getRank() == Rank.ACE) count++;
        }

        return count;
    }

    /**
     * Compare two hand values
     * @param other
     * @return
     */
    public int compareTo(Object other) {
        // First, make sure we're comparing to another BlackjackHand
        if (!(other instanceof BlackjackHand)) {
            String msg = "Can't compare a BlackjacHand  object to a " +
                    other.getClass().getName() + " object: " + other;
            throw new IllegalArgumentException(msg);
        }
        // Now this is guaranteed to work
        BlackjackHand that = (BlackjackHand) other;
        return this.value() - that.value();
    }

    /**
     * Prints out current hand value
     * @return
     */
    public String toString() {
        String ret = System.getProperty("line.separator");
        if (playerType != PlayerType.HUMAN) {
            if (null == this.faceDownCard) {
                return "Empty hand.";
            } else if (this.faceUpCards.length < 1) {
                return "One face down card";
            } else {
                ret += "One face down card" + System.getProperty("line.separator");
            }
        }

        for (int i = 0; i < this.lastFaceUpCard; ++i) {
            ret += this.faceUpCards[i] + System.getProperty("line.separator");
        }
        return ret;
    }

    /**
     * Reveals full hand
     * @return
     */
    public String show() {
        String ret = System.getProperty("line.separator");
        if (playerType != PlayerType.HUMAN) {
            if (null == this.faceDownCard) {
                return "Empty hand.";
            } else {
                ret += this.faceDownCard + System.getProperty("line.separator");
            }
        }

        for (int i = 0; i < this.lastFaceUpCard; ++i) {
            ret += this.faceUpCards[i] + System.getProperty("line.separator");
        }
        return ret;
    }
}