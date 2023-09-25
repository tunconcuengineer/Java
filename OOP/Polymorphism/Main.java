package OOP.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(70);
        animal.eat();
        animal.makeSound();

        Dog dog = new Dog("Turkish Kangal", 175);
        dog.eat();
        dog.makeSound();
    }
}
