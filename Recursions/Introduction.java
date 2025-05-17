package Recursions;

public class Introduction {
    public static void recursionIntro (String message, int i) {
        if (i == 0) {
            return;
        }
        System.out.println(message);
        recursionIntro(message, i - 1);
    }

    public static void printNumbers(int i) {
        if (i == 0) { 
            return;
        }

        System.out.println(5 - i + 1);
        printNumbers(i - 1);
    }

    public static void main(String[] args) {
        recursionIntro("Avishkar Dhanorkar", 5);
        printNumbers(5);
    }
}
