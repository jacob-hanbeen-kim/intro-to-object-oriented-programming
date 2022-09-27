package lesson.lesson9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyIterator {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("Hyundai");
        cars.add("BMW");
        cars.add("Kia");
        cars.add("Mazda");
        cars.add("Honda");

//        for (int i = 0; i < cars.size(); i++) {
//            System.out.println(cars.get(i));
//            if (cars.get(i).contains("a")) {
//                cars.remove(i);
//            }
//        }
//
//        for (String car: cars) {
//            System.out.println(car);
//        }
//
        Iterator<String> it = cars.iterator();
        while(it.hasNext()) {
            String car = it.next();
//            System.out.println(car);
            if (car.contains("a")) {
                it.remove();
            }
        }

        System.out.println(cars);
    }
}
