package lesson.lesson2;

public class Switch {
    public static void main(String[] args) {

        /** Switch Statement **/

        int randomNumber = 5;

        switch(randomNumber) {
            case 1: System.out.println("I have 1");
            case 2: System.out.println("I have 2");
            case 3: System.out.println("I have 3");
            case 4: System.out.println("I have 4"); break;
            default: System.out.println("I have nothing"); break;
        }

    }
}
