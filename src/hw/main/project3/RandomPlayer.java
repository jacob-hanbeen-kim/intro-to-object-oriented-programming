package hw.main.project3;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Random;

public class RandomPlayer extends Player {

    public RandomPlayer(String name) {
        super(name, PlayerType.RANDOM);
    }


    /**
     * Random Player should only STAND when current value is >= 17
     * Otherwise player should HIT 30% of time
     */
    @Override
    public Move getMove(BlackjackHand... opponentHands) {

        // TODO: implement getMove
        throw new NotImplementedException();
    }
}
