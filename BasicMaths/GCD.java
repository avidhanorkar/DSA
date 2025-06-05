
public class GCD {
    public static int findGCD(int a, int b) {

        if (a == b) {
            return a;
        }      

        int GCD = 1;
        for (int i = 1; i < (a>b ? b : a); i++) {
            if (a % i == 0 && b % i == 0) {
                GCD = i;
            }
        }

        return GCD;
    }

    // More Optimized Way
    public static int gcd(int a, int b) {
        // Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String args[]) {
        int a = 10;
        int b = 15;

        int c = findGCD(a, b);
        System.out.println("The GCD of " + a + " " + b + " is: " + c);
    }
}