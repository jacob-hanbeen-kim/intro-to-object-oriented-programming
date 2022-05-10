package lesson.lesson4;

public class Person {
    private String name;
    private int age;
    private String race;
    private String password;

    public Person(String name) {
        this.name = name;
        this.age = 1;
        this.password = "password";
    }

    // read access
    public String getPassword() {
        return this.password;
    }

    // write access
    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public void speak() {
        System.out.println("Hi!, my name is " + this.name);
    }
}
