package lesson.lesson5;

public class Pet {

    public String name;
    public int age;

    public Pet (String name, int age) {
        this.name = name;
        this.age = age;
    }

    // value equality
    public boolean equals(Object other) {
        // 1. null check
        if (other == null) { return false; }
        // 2. self check --> checks for identical/reference equality
        if (this == other) { return true; }
        // 3. instance check
        if (!(other instanceof Pet)) { return false; }
        // 4. data check
        Pet p = (Pet) other;
        return name == p.name && age == p.age;
    }

    public static void main (String[] args) {
        Pet dog = new Pet("Dog", 2);

        Pet cat = new Pet("Cat", 1);
        Pet dog2 = new Pet("Dog", 1);
        Pet dog3 = new Pet("Dog", 2);

        System.out.println("dog.equals(2): " + dog.equals(2)); // false because 2 not Instance of Pet
        System.out.println("dog.equals(cat): " + dog.equals(cat)); // false because Cat != Dog
        System.out.println("dog.equals(dog2): " + dog.equals(dog2)); // false because 2 != 1
        System.out.println("dog.equals(dog3): " + dog.equals(dog3)); // true
    }
}
