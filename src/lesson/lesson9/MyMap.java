package lesson.lesson9;

import java.util.*;

public class MyMap {

    public static void practice() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Kim");
        names.add("Smith");
        names.add("Kim");
        names.add("Lee");
        names.add("Kim");
        names.add("Kim");
        names.add("Lee");
        names.add("Kim");
        names.add("Kim");
        names.add("White");
        names.add("White");
        names.add("Smith");

        System.out.println(names);

        Map<String, Integer> myMap = new HashMap<>();

        for (String name: names) {
//            if (myMap.)
//                myMap.put(name, 0);
        }

        System.out.println(myMap);
    }

    public static void stringKV() {
        Map<String, String> myMap = new HashMap<>();

        myMap.put("Kim", "Jacob");
        myMap.put("Kim", "Ethan");
        myMap.put("Lee", "Joy");
        myMap.put("Green", "White");
        myMap.put("Wells", "Ethan");

        System.out.println(myMap);

        String val = myMap.get("Kim");
        System.out.println("We retrieved " + val);
        System.out.println("We retrieved " + myMap.get("Green"));
        System.out.println("We retrieved " + myMap.get("Smith"));

        String removed = myMap.remove("Kim");
        System.out.println(removed + " got removed!");
        System.out.println(myMap);

        System.out.println("keys: " + myMap.keySet());
        System.out.println("values: " + myMap.values());


        System.out.println("Contains Kim?: " + myMap.containsKey("Kim"));
        System.out.println("Contains Lee?: " + myMap.containsKey("Lee"));

        System.out.println("Contains Ethan?: " + myMap.containsValue("Ethan"));
        System.out.println("Contains Lee?: " + myMap.containsValue("Lee"));

        myMap.clear();
        System.out.println(myMap);
    }

    public static void main(String[] args) {
//        stringKV();

        Map<String, String> myMap = new HashMap<>();

        myMap.put("Key1", "Value1");
        myMap.put("Key2", "Value2");
        myMap.put("Key3", "Value3");
        System.out.println(myMap);

        Set<String> myKeys = myMap.keySet();
        System.out.println(myKeys);
//        System.out.println(myKeys.contains("Key4"));

        System.out.println(myMap.containsKey("Key4"));
        System.out.println(myMap.containsValue("Key1"));

//        Collection<String> myVals = myMap.values();
//        System.out.println(myVals);

//        myMap.
    }
}
