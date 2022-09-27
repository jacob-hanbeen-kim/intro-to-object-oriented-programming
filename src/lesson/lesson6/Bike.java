package lesson.lesson6;

public class Bike implements Vehicle {
    @Override
    public void move() {
        System.out.println("Bike is moving forward");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped");
    }

    @Override
    public void honk() {
        System.out.println("Bike honked!");
    }

    @Override
    public void park() {

    }
}
