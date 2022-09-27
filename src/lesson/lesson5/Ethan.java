package lesson.lesson5;

public class Ethan extends Person {

    public Ethan () {
        super("Ethan", 14);
    }

    @Override
    public void speak() {
        System.out.println("I am a human and can speak intelligently");
    }

    @Override
    public void walkingSound() {
        System.out.println("squeek squeek");
    }

    @Override
    public void think() {
        System.out.println("think and think again");
    }
}
