package lesson.lesson2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        // https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html

        /** System.in **/

        // nextXYZ() -- nextInt(), nextShort(), nextFloat()

        // nextLine()

        // next()

        // charAt(0)

        /** Input File **/

        try {
            //creating File instance to reference text file in Java
            File text = new File("src/lesson/lesson2/scannerTest.txt");

            //Creating Scanner instance to read File in Java
            Scanner scnr = new Scanner(text);

            //Reading each line of the file using Scanner class
            while (scnr.hasNextLine()) {
                String line = scnr.nextLine();
                System.out.println(line);
            }

            scnr.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found!");
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
