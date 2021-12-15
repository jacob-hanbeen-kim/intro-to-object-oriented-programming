package lesson.lesson1;

public class TypeCasting {
    public static void main(String[] args) {

        // Widening Casting
        // byte -> short -> char -> int -> long -> float -> double

        byte myByte = 1;
        short myShort = myByte;
        char myChar = (char) myByte;

        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myChar);

        // Narrowing Casting
        // double -> float -> long -> int -> char -> short -> byte

        double myDouble = 9.8d;
        float myFloat = (float) myDouble;

        System.out.println(myDouble);
        System.out.println(myFloat);

    }
}
