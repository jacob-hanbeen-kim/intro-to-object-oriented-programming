package hw.main.hw1;

public class Homework1_Answer {
    public static void main(String[] args) {

        /**
         * 1. Type Casting
         */

        // Use firstInt and perform Widening Casting
        int firstInt = 10;

        double firstDouble = firstInt; // TODO: replace inf with casting firstInt to double [Example]
        System.out.println(firstDouble);

        float firstFloat = firstInt; // TODO: replace "0f" with casting firstInt to float
        System.out.println(firstFloat);

        byte firstByte = (byte) firstInt; // TODO: replace "0" with casting firstInt to byte
        System.out.println(firstByte);

        // Use secondDouble and perform Narrowing Casting
        double secondDouble = 9.78d;

        int secondInt = (int) secondDouble; // TODO: replace inf with casting secondDouble to int [Example]
        System.out.println(secondInt);

        float secondFloat = (float) secondDouble; // TODO: replace "0f" with casting secondDouble to float
        System.out.println(secondFloat);

        long secondLong = (long) secondDouble; // TODO: replace "0" with casting secondDouble to long
        System.out.println(secondLong);

        /**
         * 2. Java Operators
         */

        /** Write following texts into Java Arithmetic Operations **/

        // TODO: replace inf with "8 plus 7" [Example]
        int a = 8 + 7;
        System.out.println(a);

        // TODO: replace "0" with "15 minus 7.5"
        double b = 15 - 7.5;
        System.out.println(b);

        // TODO: replace "0" with "12 multiplied by 5"
        int c = 12 * 5;
        System.out.println(c);

        // TODO: replace "0" with "95 divided by 5"
        int d = 95 / 5;
        System.out.println(d);

        // TODO: replace "0" with "26 modulus 3"
        int e = 26 % 3;
        System.out.println(e);

        // TODO: increment f
        int f = 1;
        f++;
        System.out.println(f);

        // TODO: decrement g
        int g = 24;
        g--;
        System.out.println(g);

        /**
         * 3. Java String
         */

        String text = "Intro to Object Oriented Programming is FUN!";

        // TODO: replace "" (empty string) with text concatenated with " and Interesting!" [Example]
        String concatTxt = text.concat(" and Interesting!");
        System.out.println(concatTxt);

        // TODO: replace "0" with "length" of the string in variable text
        int length = text.length();
        System.out.println(length);

        // TODO: replace "" (empty string) with text in all "UPPER CASE"
        String upperCase = text.toUpperCase();
        System.out.println(upperCase);

        // TODO: replace "" (empty string) with text in all "lower case"
        String lowerCase = text.toLowerCase();
        System.out.println(lowerCase);

        // TODO: replace "0" with "index" of word "Object"
        int index = text.indexOf("Object");
        System.out.println(index);

        /**
         * 4. Java Math
         */

        int x = 1771561;
        int y = 15625;

        // TODO: replace inf with maximum of x and y [Example]
        int max = Math.max(x, y);
        System.out.println(max);

        // TODO: replace "0" with minimum of x and y
        int min = Math.min(x, y);
        System.out.println(min);

        // TODO: replace "0" with sqrt of y
        double sqrt = Math.sqrt(y);
        System.out.println(sqrt);

        // TODO: replace "0" with absolute value of -150
        int abs = Math.abs(-150);
        System.out.println(abs);

        // TODO: replace "0" with random number between 0 and 50
        int randNumb = (int) (Math.random() * 51);
        // System.out.println(randNumb);

        /**
         * 5.Logical Operators
         */

        boolean isInSchool = true;
        boolean isAlive = true;
        boolean isUsedEveryDay = true;
        boolean isUnique = true;

        // TODO: write logic that isAvlie AND isInSchool [Example]
        boolean logic1 = isAlive && isInSchool;
        System.out.println(logic1);

        // TODO: write logic that is NOT Alive AND isInSchool [replace "true" with your logic]
        boolean logic2 = !isAlive && isInSchool;
        System.out.println(logic2);

        // TODO: write logic that isUseEveryDay AND isUnique But Not in School [replace "true" with your logic]
        boolean logic3 = isUsedEveryDay && isUnique && !isInSchool;
        System.out.println(logic3);

        // TODO: write logic that (isUnique AND inSchool) OR (isAlive and Not Used Every Day) [replace "true" with your logic]
        boolean logic4 = (isUnique && isInSchool) || (isAlive && !isUsedEveryDay);
        System.out.println(logic4);
    }
}
