package Recursions.Practice;
// 0 1 1 2 3 5 8 13 21 34 55
public class Fibonacci {
    
    public static int fibSeries(int i) {
        if (i == 1) {
            return 1;
        } else if (i == 0) {
            return 0;
        }

        return fibSeries(i - 1) + fibSeries(i - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibSeries(5));
    }
}
