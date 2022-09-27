package hw.main.project3_ans;

public abstract class Player {
    public enum Move {HIT, STAND};

    private String name;
    protected BlackjackHand hand;

    public Player(String name, PlayerType playerType) {
        this.name = name;
        this.hand = new BlackjackHand(playerType);
    }

    public String getName() {
        return this.name;
    }

    public BlackjackHand getHand() {
        return this.hand;
    }

    public void dealFaceUp(Card card) {
        this.hand.addFaceUp(card);
    }

    public void dealFaceDown(Card card) {
        this.hand.addFaceDown(card);
    }

    public abstract Move getMove(BlackjackHand ... opponentHands);
}
