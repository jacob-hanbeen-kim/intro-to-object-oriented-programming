package lesson.lesson2;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        // #TODO: Practice Using StringBuffers

        StringBuilder sb = new StringBuilder();

        // append
        sb.append("hi");
        sb.append('c');
        // setCharAt
        sb.setCharAt(0, 'p');
        sb.setCharAt(2, 'g');
        // toString
        System.out.println(sb.toString());

        // #TODO: Practice Using String Methods

        String s = "Hello World!";
        // charAt
        System.out.println(s.charAt(6));
        System.out.println(s.charAt(11));
        System.out.println(s.charAt(s.length() - 1));
        // indexOf
        System.out.println(s.indexOf('W'));
        System.out.println(s.indexOf('!'));

        // loop
        System.out.println(s.indexOf('l'));
        System.out.println(s.indexOf('l', 3));


        System.out.println(s.indexOf('A')); // this is kind of like .contains --> when you get -1 you know that char doesn't exist in String
        // length
        s.length();

        // #TODO: Practice Using Scanner

        Scanner scan = new Scanner(System.in);
        // next
        System.out.print("Type your name: ");
        String input = scan.next();
        System.out.println(input);

        System.out.print("This will get  ");
        System.out.print("printed in same line \n");

        System.out.println("This will get");
        System.out.println("printed in next line");


        // #TODO: Practice Using For Loop

        // forLoop to create a string of characters
        StringBuilder sb2 = new StringBuilder();

        String secretWord = "ethan";
        for (int i = 0; i < secretWord.length(); i++) {
            sb2.append('_');
            // logic to add "a"s to the string builder
        }
        System.out.println(sb.toString()); // "_____"

        // #TODO: Practice Using While Loop

//         while loop with different conditions
        int i = 0;
        String secretWord2 = "ethan";
        while(i < secretWord2.length()) {
            sb.append('_');
            i++;
        }
        System.out.println(sb.toString());

        Scanner scan2 = new Scanner(System.in);
        String input2 = "";
        while(!input2.equals("q")) {
            System.out.print("Type Something: ");
            input2 = scan2.next();
            System.out.println();
        }

        // As long as the player has made fewer than five misses
        // and has not guessed all the letters in the word:

        int misses = 5;
        boolean hasGuessedTheWord = false;
        while (misses > 0 && !hasGuessedTheWord);
//

        // #TODO: Practice Using Conditionals

        // conditionals
        Scanner scan3 = new Scanner(System.in);
        System.out.print("Type Something: ");
        String input3 = scan.next();

        char guess = input.charAt(0);
        String secretWord3 = "elephant ears";
        StringBuilder currentGuess = new StringBuilder();
        currentGuess.append("_____");
        StringBuilder missedLetters = new StringBuilder();

        int misses2 = 5;

        int index = secretWord.indexOf(guess); // 0
        if (index != -1) { // does the guessed character exist in secretWord?
            // replace _ with guessed character

            // logic to find all the occurences of the guess
            while(index != -1) { // guess = "e"
                currentGuess.setCharAt(index, guess); // e_e______ e___
                index = secretWord.indexOf(guess, index + 1);
            }
        } else {
            // decrement misses count
            misses2--;
            // append missed letter to string builder
            missedLetters.append(guess);
        }


    }

}
