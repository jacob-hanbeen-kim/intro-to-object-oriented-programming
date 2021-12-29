package lesson.lesson2;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        /** While Loop **/

        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        int live = 5;
        while (!input.equals("q") && live > 0) {
            input = sc.next();
            System.out.println("You wrote: " + input);
            live--;
        }

        /** Do While Loop **/

        String name = "Ethan";

        while (!name.equals("Jacob")) {
            System.out.println(name);
        }

        do {
            System.out.println(name);
        } while (!name.equals("Jacob"));


        String word = "cat";
        String guess;

        StringBuilder sb = new StringBuilder();
        int misses = 0;
        do {
            System.out.println("Misses: " + misses);
            System.out.println("Guess a word: ");
            guess = sc.next();
            sb.append(guess);
            System.out.println("Your guessed words: " + sb.toString());

            if (!word.contains(guess)) {
                misses++;
            }
        } while (misses < 5);

        if (misses == 5) {
            System.out.println("You LOSE!!");\
        }

        /** While loop only executes code block when condition is met
         * Do While loop executes the code block at least once even if condition is not met
         */

    }
}
