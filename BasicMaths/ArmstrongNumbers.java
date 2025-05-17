package BasicMaths;


// Armstrong Numbers: 
    // sum of digits where each digts are raised to the number of digits
    // Example: 
    // n = 256
    // number of digits: 3
    // sum = 2 ^ 3 + 5 ^ 3 + 6 ^ 3 
    // if the sum is equal to the number itself then the number is armstrong number

public class ArmstrongNumbers {
    public static boolean isArmstrong(int n) {
        int num = 0;
        int number = n;
        int number2 = n;
        
        while (number != 0) {
            num++;
            number = number / 10;
        }

        int sum = 0;
        while (number2 != 0) {
            sum = sum + (int)  Math.pow((number2 % 10), num);
            number2 = number2 / 10;
        }

        return sum == n;
    }

    public static void main(String args[]) {
        System.out.println(isArmstrong(153));
    }
}


    