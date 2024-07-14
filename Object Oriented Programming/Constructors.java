// Constructors in Java

class Student{
    String name;
    int age;

    // Unparameterized Constructor
    Student(){
        System.out.println("The object is created using the unparameterized constructor.");
    }

    // Parameterized Constructor
    Student(String n, int a) {
        this.name = n;
        this.age = a;
    }

    // Copy Constructor
    Student(Student studentObject){
        this.name = studentObject.name;
        this.age = studentObject.age;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student("Avishkar", 21);  // Creating the object s1 using parameterized constructor
        Student s2 = new Student(); // creating object s2 using unparameterized Constructor
        Student s3 = new Student(s1); // Creating a new object s3 by copying the properties of the student s1
        System.out.println(s1.name);
    }
}
