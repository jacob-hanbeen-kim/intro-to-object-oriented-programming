package lesson.lesson2;

public class Conditionals {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        /** If, Else, Else If **/

        /** Less than: a < b **/

        if (a < b) {
            System.out.println("A is less than B!");
        }

        /** Less than or equal to: a <= b **/
        else if (a <= b) {
            System.out.println("A is less than or equal to B!");
        }

        /** Greater than: a > b **/

        else if (a > b) {
            System.out.println("A is greater than B!");
        }


        /** Greater than or equal to: a >= b **/

        else if (a >= b) {
            System.out.println("A is greater than or equal to B!");
        }

        /** Equal to a == b **/
        /** Not Equal to: a != b **/
        else {
            System.out.println("A is equal to B!");
            System.out.println("or A does not equal to B!");
        }


        /** Ternary Operation **/

        // variable = (condition) ? expressionTrue : expressionFalse
        int age = 21;
        String status = (age > 18) ? "Adult" : "Child";
        System.out.println(status);

    }
}
