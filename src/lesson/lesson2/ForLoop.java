package lesson.lesson2;

public class ForLoop {
    public static void main(String[] args) {

        /** For Loop **/

        int[] numbers = new int[5];
        numbers[0] = 50;
        numbers[1] = 60;
        numbers[2] = 70;
        numbers[3] = 80;
        numbers[4] = 90;

//        for(int i = numbers.length - 1; i >= 0; i--) {
//            System.out.println(numbers[i]);
//        }

        /** For Each Loop **/

        for (int n : numbers) {
            System.out.println(n);
        }


    }
}
