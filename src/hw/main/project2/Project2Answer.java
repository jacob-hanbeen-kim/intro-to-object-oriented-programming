package hw.main.project2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Project2Answer {

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    public static void printRange(int start, int end) {
        String startString = start + "";
        String endString = end + "";

        for (int i = 0; i < 2 - startString.length(); i++) {
            startString = " " + startString;
        }

        for (int j = 0; j < 3 - endString.length(); j++) {
            endString = " " + endString;
        }

        System.out.print(endString + " - " + startString + " | ");
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/hw/main/project2/grades.csv");

        // Step 1: initialize scanners
        Scanner fileScanner = new Scanner(file);
        Scanner inputScanner = new Scanner(System.in);

        // Step 2: Take user input
        System.out.print("How many bins would you like? ");
        int binSize = inputScanner.nextInt();
        System.out.println("");

        // Step 3: initialize bin
        int[] bin = new int[binSize];

        while(fileScanner.hasNextLine()){
            String[] data = fileScanner.nextLine().split(",");
            int score = Integer.parseInt(data[1].trim());

            int offset = 101 - ((100 / binSize) * binSize);
            int index = (score - offset) / (100 / binSize);
            if (index < 0) index = 0;
            else if (score == 100) {
                index = binSize - 1;
            }

            bin[index] += 1;
        }

        int offset = 101 - ((100 / binSize) * binSize);
        for (int i = bin.length - 1; i >= 0 ; i--) {
            int start = i * (100 / binSize);
            int end = start + offset + (100 / binSize) - 1;

            if (i != 0) start += offset;

            printRange(start, end);
            for (int j = 0; j < bin[i]; j++) {
                System.out.print("[]");
            }
            System.out.println("");
        }

    }
}
