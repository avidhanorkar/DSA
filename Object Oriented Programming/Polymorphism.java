// In Java, there are two types of polymorphism
// 1. Compile Time Polymorphism
// 2. Run Time Polymorphism


// Compile Time Polymorphism
// It can be achieved by method Overloading
// Method Overloading: Same function name, different parameters
public class Polymorphism{
    int sum (int a, int b){
        return a + b;
    }
    int sum (int a, int b, int c){
        return a + b + c;
    }    
    double sum (int a, double b){
        return a + b;
    }
}


// Run Time Polymorphism
// It can be achieved by method overriding
// Method Overriding: When the derived class created different implementation to the method inherited from base class.
// Example of Run Time Polymorphism
class Animal{
    void sound(){
        System.out.println("Animal is creating some kind of noise");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog is barking");
    }
}
