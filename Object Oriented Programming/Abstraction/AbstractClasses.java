// Abstract Classes in Java

// Abstract classes are classes that cannot be instantiated on their own and are designed to be inherited by other classes.
// They can have both abstract and non-abstract methods.

// Creating an Abstract Animal Class
abstract class Animal {
    // Abstract classes can have constructors
    Animal() {
        System.out.println("Animal Constructor called");
    }

    // Abstract method: A method declared without an implementation
    abstract void walk();

    // Non-abstract method: A method with an implementation
    void eats() {
        System.out.println("Eating");
    }

    // Abstract classes can have state (instance variables)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Concrete class: A class that extends an abstract class and provides an implementation for all abstract methods
class Horse extends Animal {
    Horse() {
        System.out.println("Horse Constructor Called");
    }

    // Implementing the abstract walk() method
    void walk() {
        System.out.println("Horse is walking");
    }
}

// Another concrete class that extends the Horse class
class Ghoda extends Horse {
    Ghoda() {
        System.out.println("Ghoda Constructor Called");
    }

    // Overriding the walk() method
    void walk() {
        System.out.println("Ghoda is walking");
    }
}

// Abstract class with multiple abstract methods
abstract class Bird extends Animal {
    abstract void fly();
    abstract void chirp();
}

// Concrete class that extends the Bird class
class Sparrow extends Bird {
    void walk() {
        System.out.println("Sparrow is walking");
    }

    void fly() {
        System.out.println("Sparrow is flying");
    }

    void chirp() {
        System.out.println("Sparrow is chirping");
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        // Creating instances of concrete classes
        Ghoda mazaGhoda = new Ghoda();
        mazaGhoda.walk();

        Sparrow sparrow = new Sparrow();
        sparrow.walk();
        sparrow.fly();
        sparrow.chirp();

        // Abstract classes cannot be instantiated directly
        // Animal animal = new Animal(); // Error!

        // But we can create an array of Animal references and store instances of concrete classes
        Animal[] animals = new Animal[3];
        animals[0] = new Horse();
        animals[1] = new Ghoda();
        animals[2] = new Sparrow();

        // We can call the non-abstract eats() method on all animals
        for (Animal animal : animals) {
            animal.eats();
        }
    }
}