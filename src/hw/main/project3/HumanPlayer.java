package hw.main.project3;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Scanner;

public class HumanPlayer extends Player {

    Scanner keyboard;

    public HumanPlayer(String name) {
        super(name, PlayerType.HUMAN);
        keyboard = new Scanner(System.in);
    }

    /**
     * Ask user for action (H for hit and S for stand)
     * and perform given action
     * @param opponentHands
     * @return
     */
    @Override
    public Move getMove(BlackjackHand... opponentHands) {
        // TODO: implement getMove
        throw new NotImplementedException();
    }
}
