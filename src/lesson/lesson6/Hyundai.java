package lesson.lesson6;

public abstract class Hyundai {
    public void connectBlueTooth() {
        System.out.println("connecting to bluetooth");
    }

    // from Vehicle
    public abstract void move();

    public abstract void stop();

    public abstract void honk();

    public abstract void park();

    public abstract void chargephone();
}
