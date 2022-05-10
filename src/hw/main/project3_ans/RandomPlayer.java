package hw.main.project3_ans;

import java.util.Random;

public class RandomPlayer extends Player {

    public RandomPlayer(String name) {
        super(name, PlayerType.RANDOM);
    }

    @Override
    public Move getMove(BlackjackHand... opponentHands) {

        if (hand.value() >= 17) return Move.STAND;
        Random rand = new Random();
        if (rand.nextInt(10) < 3) {
            return Move.HIT;
        } else {
            return Move.STAND;
        }
    }
}
