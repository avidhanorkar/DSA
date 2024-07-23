// Abstraction in Java can be achieved by 
// 1. Abstract Classes
// 2. Interfaces


// Creating an Abstract Animal Class
abstract class Animal{
    Animal() {
        System.out.println("Animal Constructor called");
    }

    abstract void walk();
    void eats(){
        System.out.println("Eating");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constructor Called");
    }

    void walk(){
        System.out.println("Horse is walking");
    }
}

class Ghoda extends Horse {
    Ghoda(){
        System.out.println("Ghoda Constructor Called");
    }

    void walk(){
        System.out.println("Ghoda is walking");
    }
}


public class AbstractClasses{
    public static void main(String[] args){
        Ghoda mazaGhoda = new Ghoda();
        mazaGhoda.walk();
        
    }
}