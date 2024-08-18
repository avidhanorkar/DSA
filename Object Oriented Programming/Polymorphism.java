// Compile Time Polymorphism
// It can be achieved by method Overloading
// Method Overloading: Same function name, different parameters
public class Polymorphism {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    double sum(int a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Polymorphism p = new Polymorphism();
        System.out.println(p.sum(10, 20));  // Output: 30
        System.out.println(p.sum(10, 20, 30));  // Output: 60
        System.out.println(p.sum(10, 20.5));  // Output: 30.5
    }
}

// Run Time Polymorphism
// It can be achieved by method overriding
// Method Overriding: When the derived class created different implementation to the method inherited from base class.
class Animal {
    void sound() {
        System.out.println("Animal is creating some kind of noise");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat is meowing");
    }
}

class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();  // Output: Animal is creating some kind of noise

        animal = new Dog();
        animal.sound();  // Output: Dog is barking

        animal = new Cat();
        animal.sound();  // Output: Cat is meowing
    }
}