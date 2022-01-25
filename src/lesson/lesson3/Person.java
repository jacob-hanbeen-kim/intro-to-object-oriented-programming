package lesson.lesson3;

public class Person {

    public String getName() {
        return "ethan";
    }

    public void sayHello() {
        System.out.println("Hello Everyone!");
    }

    public static void main(String[] args) {
        Person person1 = new Person();

        String name = person1.getName();
        System.out.println(name);

        person1.sayHello();
    }

}
