package lesson.lesson3;

public class Array2D {

    public static void main(String[] args) {

        int[][] myNumbers = { {1,2,3,4}, {5,6,7,8,9,10}};

        //int numb = myNumbers.length; // 2
        //int numb = myNumbers[0].length; // 4
        //int numb = myNumbers[1].length; // 6
        //System.out.println(numb);

        // iterate through 2d array
        // { {1,2,3,4}, {5,6,7,8,9,10}};

        // i = 0 ; i < 2 ; i++
        //for (int i = 0; i < myNumbers.length; i++) {
        //    for (int j = 0; j < myNumbers[i].length; j++) {
        //        System.out.println(myNumbers[i][j]);
        //    }
        //}

        String[][] gameboard = new String[8][8];

        for (int i = 0; i < gameboard.length; i++) {
            System.out.println();
            for (int j = 0; j < gameboard[i].length; j++) {
                System.out.print("|  ");
            }
            System.out.print("|");
        }
    }
}
