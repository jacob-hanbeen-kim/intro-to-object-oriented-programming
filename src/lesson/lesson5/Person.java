package lesson.lesson5;

public abstract class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return this.name; }
    public int getAge() { return this.age; }

    public abstract void speak();
    public abstract void walkingSound();
    public abstract void think();

    public void introduce() {
        System.out.println("Hi my name is " + this.name);
    }
}