class Pen{
    String color;  // properties of the class
    int tip;

    // This Keyword is used to refer the current object

    Pen(String color, int tip){  // Constructor Method
        this.color = color;
        this.tip = tip;
    }

    // Functions in the class
    void setColor ( String newColor ){  // setter function
        color = newColor;
    }
    void setTip (int newTip) {  // setter function
        tip = newTip;
    }
    void dispProps(){  // Getter Function
        System.out.println("The color of the pen is " + color + " and the thickness of the pen is " + tip + ".");
    }

}

public class ClassesAndObjects {
    public static void main (String args[]){  // this is where the execution of program starts in java
        // Creating the object of class Pen;
        Pen pen1 = new Pen("Black", 5);  // On creating the object, the constructor is called
        pen1.dispProps();
    }
}

