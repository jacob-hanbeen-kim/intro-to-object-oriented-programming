package lesson.lesson9;

import lesson.lesson3.Array;

import java.util.ArrayList;
import java.util.HashSet;

public class MyList {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        // add function
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

        System.out.println(cars);

        // contains - check whether item exists in a set
        boolean hasVolvo = cars.contains("Volvo");
        System.out.println(hasVolvo);
        boolean hasHyundai = cars.contains("Hyundai");
        System.out.println(hasHyundai);

        // remove - removes an item
        cars.remove("BMW");
        System.out.println(cars);

        // size
        int size = cars.size();
        System.out.println(size);

        // iterator - loop through each item
        for (String car : cars) {
            System.out.println(car);
        }

        // clear - removes all item
        cars.clear();
        System.out.println(cars);
    }
}
