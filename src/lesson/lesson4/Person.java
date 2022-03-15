package lesson.lesson4;

public class Person {
    String name;
    int age;
    String race;

    public Person(String name) {
        this.name = name;
        this.age = 1;
    }

    public void speak() {
        System.out.println("Hi!, my name is " + this.name);
    }
}
