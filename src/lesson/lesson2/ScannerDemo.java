package lesson.lesson2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        // https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html

        /** System.in **/

        System.out.println("Hello World!");

        Scanner input = new Scanner(System.in);

        // nextXYZ() -- nextInt(), nextShort(), nextFloat()

        System.out.print("What is your age? ");
        int age = input.nextInt();

        System.out.print("How much do you weight? ");
        float weight = input.nextFloat();

        System.out.print("How tall are you? ");
        double height = input.nextDouble();

        // nextLine()
        // next()
        // charAt(0)

        System.out.print("What's your first name? ");
        String name = input.next();

        System.out.print("What's your last name? ");
        String lastName = input.next();


        System.out.println("Hi " + name + " " + lastName.charAt(0) + "!");
        System.out.println("Your age is " + age);
        System.out.println("Your weight is " + weight);
        System.out.println("Your height is " + height);


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
