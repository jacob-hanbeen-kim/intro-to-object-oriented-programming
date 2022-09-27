package hw.main.project4;

import java.util.Random;

public class RandomAI extends AI{

    private static final Random randomizer = new Random();

    public RandomAI(Coordinates cannonTarget, Coordinates secretHQ) {
        super(cannonTarget, secretHQ);
    }

    @Override
    public boolean shouldSwapCannonTarget() {
        return false;
    }

    @Override
    public boolean shouldSelfDestruct() {
        return false;
    }
}
