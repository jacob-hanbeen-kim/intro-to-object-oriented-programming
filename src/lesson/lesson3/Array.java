package lesson.lesson3;

public class Array {

    public static void main(String[] args) {

        String[] nameArray = {"Jacob", "Ethan", "Joy", "Liz"};
        System.out.println(nameArray);
        System.out.println(nameArray[0]);

        System.out.println("");

        nameArray = new String[8];
        nameArray[0] = "J";
        nameArray[1] = "a";
        nameArray[2] = "c";
        nameArray[3] = "o";
        nameArray[4] = "b";
        nameArray[5] = "K";
        nameArray[6] = "i";
        nameArray[7] = "m";

        System.out.println(nameArray);
        for(int i =0; i < nameArray.length; i++) {
            System.out.println(nameArray[i]);
        }
    }
}
