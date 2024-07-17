class Animal{  // base class or Parent class
    void eat(){
        System.out.println("eating");
    }

    void breath(){
        System.out.println("breathing");
    }
}

class Dog extends Animal{  // derived class or Child class
    void bark(){
        System.out.println("barking");
    }
}

public class Inheritance{
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();  // dog object using the property of the parent class
        d.breath();  // dog object using the property of the parent class
        d.bark();  // dog object using the property of its own class
    }
}