package lesson.lesson7;

import java.util.ArrayList;

public class MyList {

    public static void main(String[] args) {
//        String[] c = new String[4];
//        c[0] = "BMW";
//        for (int i = 0; i < c.length; i++) {
//            System.out.println(c[i]);
//        }

        ArrayList<String> car = new ArrayList<String>();

        System.out.println(car);
        car.add("BMW");
        System.out.println(car);
        car.add("Hyundai");
        System.out.println(car);

        System.out.println(car.size());

//        car.set(1, "Toyota");
//        System.out.println(car);
//
//        car.remove(1);
//        System.out.println(car);
//
//        car.clear();
//        System.out.println(car);
    }
}
