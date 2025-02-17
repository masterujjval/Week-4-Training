package annotation.exercise.override;


public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Polymorphism
        myDog.makeSound(); // Call overridden method
    }
}
