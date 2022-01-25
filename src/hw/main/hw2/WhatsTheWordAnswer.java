package hw.main.hw2;
import java.util.Random;
import java.util.Scanner;

public class WhatsTheWordAnswer {

    static final String[] CANDIDATES = {"cat", "dad", "dog", "mom", "rat"};

    public static void main(String[] args) {

        String secretWord = args.length > 0
                ? CANDIDATES[Integer.parseInt(args[0])]
                : CANDIDATES[new Random().nextInt(CANDIDATES.length)];

        // Your code goes here:

        /** 1. Initialize Needed variables **/
        Scanner sc = new Scanner(System.in);
        StringBuilder missedLetters = new StringBuilder();
        StringBuilder currentGuess = new StringBuilder();

        int misses = 5;
        boolean guessed = false;

        /** 2. Create hidden current guess string **/
        for (int i = 0; i < secretWord.length(); i++) {
            currentGuess.append("_");
        }

        /** 3. While loop with appropriate conditions **/
        while (misses > 0 && !guessed) {
            /** 4. Print out misses count and missedLetters **/
            System.out.print("Missed letters (" + misses + " left): ");
            System.out.println(missedLetters.toString());

            /** 5. Print out current guess string **/
            System.out.print("Current guess: ");
            System.out.println(currentGuess.toString());

            /** 6. Retrieve player guess **/
            System.out.print("Guess a letter: ");

            String playerInput = sc.next();
            System.out.println();

            /** 7. Check if player guessed a char in secrete word **/
            char guess = playerInput.charAt(0);
            int idx = secretWord.indexOf(guess);

            if (idx != -1) {
                /** 12. Iterate through the current guess to check if there is duplicate letters and replace all **/
                while (idx != -1) {
                    /** 8. Replace hidden current guess with correctly guessed character **/
                    currentGuess.setCharAt(idx, guess);

                    /** 9. Check if player have guessed all the letters **/
                    if (currentGuess.indexOf("_") == -1) {
                        guessed = true;
                    }
                    idx = secretWord.indexOf(guess, idx + 1);
                }
            } else {
                /** 10. Append missed letters and decrement the misses count **/
                missedLetters.append(guess);
                misses--;
            }

        }

        /** 11. Print out final statements **/
        System.out.print("Missed letters: ");
        System.out.println(missedLetters.toString());

        System.out.print("Final guess: ");
        System.out.println(currentGuess.toString());
        if (guessed) {
            System.out.println("Congratulations! You got it!");
        } else {
            System.out.println("Sorry, too many misses. The secret word was " + secretWord);
        }
    }
}
