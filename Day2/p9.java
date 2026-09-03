package Day2;

// Parent Class
class Animal {

    String name;

    // Parent Constructor
    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating food.");
    }

    public void makeSound() {
        System.out.println(name + " makes a generic animal sound.");
    }
}

// Child Class
class Dog extends Animal {

    String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says Woof!");
    }

    public void displayBreed() {
        System.out.println(name + " is a " + breed);
    }
}

// Main Class
public class p9 {

    public static void main(String[] args) {

        Dog d = new Dog("Tommy", "Labrador");

        d.eat();
        d.makeSound();
        d.displayBreed();
    }
}
