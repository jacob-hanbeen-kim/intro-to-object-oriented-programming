package lesson.lesson1;

public class JavaOperators {
    public static void main(String[] args) {

        /** Arithmetic Operators **/

        int addition = 1 + 2;
        int subtraction = 2 - 1;
        int multiplication = 5 * 5;
        int division = 5 / 5;
        int modulus = 2 % 5;

        int x = 2;
        int increments = x++;
        int decrements = x--;

        /** Assignment Operators **/

        int assignment = 5;

        assignment += 5; // assignment = assignment + 5
        assignment -= 5; // assignment = assignment - 5
        assignment *= 5; // assignment = assignment * 5
        assignment /= 5; // assignment = assignment / 5
        assignment %= 5; // assignment = assignment % 5

        /** Comparison Operators **/

        int one = 1;
        int two = 2;

        boolean equalTo = one == two; // yields false
        boolean notEqual = one != two; // yields true
        boolean greaterThan = one > two; // yields false
        boolean lessThan = one < two; // yields true
        boolean greaterThanOrEqual = one >= two; // yields false
        boolean lessThanOrEqual = one <= two; // yields true

        /** Logical Operators **/

        boolean isTrue = true;
        boolean isFalse = false;

        boolean logicalAND = isTrue && isFalse; // yields false -- only yields true when TRUE && TRUE
        boolean logicalOR = isTrue || isFalse; // yields true -- only yields false when FALSE || FALSE
        boolean logicalNOT = !isTrue; // yields false -- gives opposite of (TRUE --> FALSE, FALSE --> TRUE)

    }
}
