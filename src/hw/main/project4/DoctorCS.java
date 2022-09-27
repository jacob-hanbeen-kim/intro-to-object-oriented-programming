package hw.main.project4;

public class DoctorCS {

    private AI ai;
    private String secretIdentity;
    private int jlaid;
    private boolean safe;

    public DoctorCS(AI ai, String secretIdentity, int jlaid) {
        this.ai = ai;
        this.secretIdentity = secretIdentity;
        this.jlaid = jlaid;
        this.safe = false;
    }

    public AI getAI() {
        return this.ai;
    }

    public int getJlaid() {
        return this.jlaid;
    }

    private void setSafe(boolean safe) {
        this.safe = safe;
    }
}
