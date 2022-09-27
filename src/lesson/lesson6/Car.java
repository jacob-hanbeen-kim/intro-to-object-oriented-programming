package lesson.lesson6;

public class Car extends Hyundai implements Vehicle, Owned, Customizable {
    private String owner;

    // from Vehicle
    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void honk() {
        System.out.println("Car Honked");
    }

    @Override
    public void park() {
        System.out.println("Car parked");
    }

    // from Owned
    @Override
    public boolean hasOwner() {
        return false;
    }

    @Override
    public String getOwner() {
        return this.owner;
    }

    @Override
    public void customize() {
        System.out.println("Radnomly customizing...");
    }

    public void panic() {
        System.out.println("!!!!!!!Beep Beep!!!!!!!");
    }

    @Override
    public void chargephone() {
        System.out.println("Charging phone...");
    }
}
