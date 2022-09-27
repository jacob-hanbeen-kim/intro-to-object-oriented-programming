package lesson.lesson6;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Train is moving fast");
    }

    @Override
    public void stop() {
        System.out.println("Train stopped");
    }

    @Override
    public void honk() {
        System.out.println("Train hooooooonk!");
    }

    @Override
    public void park() {

    }

    public void hitBreak() {
        System.out.println("Giiiiiiiiiii!");
    }
}
