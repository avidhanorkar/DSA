// Single Inheritance
class Animal {  // base class or Parent class
    void eat() {
        System.out.println("eating");
    }

    void breath() {
        System.out.println("breathing");
    }
}

class Dog extends Animal {  // derived class or Child class
    void bark() {
        System.out.println("barking");
    }
}

// Multilevel Inheritance
class Mammal extends Animal {
    void giveBirth() {
        System.out.println("giving birth");
    }
}

class Human extends Mammal {
    void think() {
        System.out.println("thinking");
    }
}

// Hierarchical Inheritance
class Vehicle {
    void move() {
        System.out.println("moving");
    }
}

class Car extends Vehicle {
    void accelerate() {
        System.out.println("accelerating");
    }
}

class Truck extends Vehicle {
    void carryLoad() {
        System.out.println("carrying load");
    }
}

// Hybrid Inheritance (not directly supported in Java, but can be achieved using interfaces)
interface Flyable {
    void fly();
}

interface Walkable {
    void walk();
}

class Bird implements Flyable, Walkable {
    public void fly() {
        System.out.println("flying");
    }

    public void walk() {
        System.out.println("walking");
    }
}

class Bat implements Flyable {
    public void fly() {
        System.out.println("flying");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Single Inheritance
        Dog d = new Dog();
        d.eat();  // dog object using the property of the parent class
        d.breath();  // dog object using the property of the parent class
        d.bark();  // dog object using the property of its own class

        // Multilevel Inheritance
        Human h = new Human();
        h.eat();  // human object using the property of the grandparent class
        h.breath();  // human object using the property of the grandparent class
        h.giveBirth();  // human object using the property of the parent class
        h.think();  // human object using the property of its own class

        // Hierarchical Inheritance
        Car c = new Car();
        c.move();  // car object using the property of the parent class
        c.accelerate();  // car object using the property of its own class

        Truck t = new Truck();
        t.move();  // truck object using the property of the parent class
        t.carryLoad();  // truck object using the property of its own class

        // Hybrid Inheritance
        Bird b = new Bird();
        b.fly();  // bird object using the property of the Flyable interface
        b.walk();  // bird object using the property of the Walkable interface

        Bat bt = new Bat();
        bt.fly();  // bat object using the property of the Flyable interface
    }
}