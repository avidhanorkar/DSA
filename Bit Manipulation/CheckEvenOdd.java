public class CheckEvenOdd {
    // approach 1
    public static void evenOdd1(int a){
        // a is binary number
        int b = a & 1;
        if (b == 1){
            System.out.println("The binary number: " + a + " is odd number.");
        } else{
            System.out.println("The binary number: " + a + " is even number.");
        }
    }

    // approach 2
    public static void evenOdd2(int a){
        // a is binary Number
        int b = a % 1;
        if (b == 1){
            System.out.println("The binary number: " + a + " is odd number.");
        } else{
            System.out.println("The binary number: " + a + " is even number.");
        }
    }

    public static void main(String[] args) {
        int bin = 101;
        evenOdd1(bin);
        evenOdd2(bin);
    }
}
