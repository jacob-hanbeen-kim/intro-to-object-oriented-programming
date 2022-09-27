package hw.main.project4;

public abstract class AI {
    private boolean destructed = false;
    private Coordinates cannonTarget;
    private Coordinates secreteHQ;

    public AI(Coordinates cannonTarget, Coordinates secreteHQ) {
        this.cannonTarget = cannonTarget;
        this.secreteHQ = secreteHQ;
    }

    public boolean swapCannonTarget(Coordinates newCoords) {
        if (!destructed && !newCoords.equals(this.cannonTarget)) {
            if (this.shouldSwapCannonTarget()) {
                this.cannonTarget = newCoords;
                return true;
            } else if (this.shouldSelfDestruct()) {
                this.selfDestruct();
                return false;
            }
        }

        return false;
    }

    public abstract  boolean shouldSwapCannonTarget();

    public void selfDestruct() {
        this.destructed = true;
    }
    public abstract  boolean shouldSelfDestruct();

    public String toString() {
        return "Dr. Chipotle's guacamole cannon is currently pointed at " + this.cannonTarget.toString();
    }
}
