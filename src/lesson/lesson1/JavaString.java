package lesson.lesson1;

public class JavaString {
    public static void main(String[] args) {

        String text = "Hello World !";

        /** length of the string **/
        text.length(); // yields 13

        /** converts all characters to upper case **/
        text.toUpperCase(); // yields "HELLO WORLD !"

        /** convert all characters to lower case **/
        text.toLowerCase(); // yields "hello world !"

        /** get index of the given word or character **/
        text.indexOf("World"); // yields 6
    }
}
