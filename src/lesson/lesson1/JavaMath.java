package lesson.lesson1;

public class JavaMath {
    public static void main(String[] args) {

        /** Find Max **/
        int max = Math.max(25, 5);
        System.out.println(max);

        /** Find Min **/
        int min = Math.min(25, 5);
        System.out.println(min);

        /** Find Square Root **/
        double sqrt = Math.sqrt(25);
        System.out.println(sqrt);

        /** Find Absolute Value **/
        int abs = Math.abs(-150);
        System.out.println(abs);

        /** Find Random Value **/
        double randomVal = Math.random();
        System.out.println(randomVal);

        /** Find Random Value Between 0 and 100 **/
        double rand0to100 = (int) (Math.random() * 101);
        System.out.println(rand0to100);
    }
}
