package lesson.lesson3;

public class Lesson3 {

    private String name;

    public void sayHello() {
        System.out.println("Hello");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println(age);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return 1;
    }

    public static void main(String[] args) {
        Lesson3 l3 = new Lesson3();

        l3.sayHello();
        l3.setName("Jacob");
        System.out.println(l3.getName());
        l3.setName("Ethan");
        System.out.println(l3.getName());
        System.out.println(l3.getAge());

    }
}
