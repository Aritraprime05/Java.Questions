abstract class Animal {
    abstract void sound();  // Abstract method

    public void eat() {  // Non-abstract method
        System.out.println("This animal eats.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();  // Output: Bark
        dog.eat();    // Output: This animal eats.
    }
}