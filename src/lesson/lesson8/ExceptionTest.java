package lesson.lesson8;

import java.io.IOException;

public class ExceptionTest {

    public static void getBook(int index) throws ArrayIndexOutOfBoundsException {
        String[] array = {"locked", "locked", "Harry Potter", "How to Cook", "CS1101"};

        if (index < 2 && index >= 0) {
            throw new ArrayIndexOutOfBoundsException("Access Denied! Locked files");
        } else {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        try {
            getBook(-1);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Your index is out of bound: " + e.getMessage());
        } finally {
            System.out.println("Finished getting books");
        }
    }
}
