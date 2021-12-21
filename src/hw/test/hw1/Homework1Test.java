package hw.test.hw1;

import hw.main.hw1.Homework1;

import static org.junit.jupiter.api.Assertions.*;

public class Homework1Test {

    @org.junit.jupiter.api.Test
    public void main() {
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        Homework1 homework1 = new Homework1();
        homework1.main(null);

        assertEquals("10.0\n" +
                "10.0\n" +
                "10\n" +
                "9\n" +
                "9.78\n" +
                "9\n" +
                "15\n" +
                "7.5\n" +
                "60\n" +
                "19\n" +
                "2\n" +
                "2\n" +
                "23\n" +
                "Intro to Object Oriented Programming is FUN! and Interesting!\n" +
                "44\n" +
                "INTRO TO OBJECT ORIENTED PROGRAMMING IS FUN!\n" +
                "intro to object oriented programming is fun!\n" +
                "9\n" +
                "1771561\n" +
                "15625\n" +
                "125.0\n" +
                "150\n" +
                // "30\n" +
                "true\n" +
                "false\n" +
                "false\n" +
                "true\n", out.toString());
    }
}