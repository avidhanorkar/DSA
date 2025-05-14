// 1701
package Arrays.Practice;

import java.util.Arrays;

public class AverageWaitingTime {

    public static double avgWaitingTime(int[][] customers) {
        double ans = 0;
        int waitingTime = 0;

        int[] prepTime = new int[customers.length];
        for (int i = 0; i < customers.length; i++) {
            prepTime[i] = customers[i][0] + customers[i][1];
            if (i == 0) {
                waitingTime = waitingTime + prepTime[i] - customers[i][0];
                System.out.println(i + "th: " + waitingTime);
            } else {
                waitingTime = waitingTime + prepTime[i] + prepTime[i - 1] - customers[i][0];
                System.out.println(i + "th: " + waitingTime);
            }
        }

        System.out.println("Prep Array: " + Arrays.toString(prepTime));

        ans = waitingTime / customers.length;

        return ans;
    }

    public static void main(String arg[]) {
        int[][] customers = {
            {1, 2}, {2, 5}, {4, 3}
        };
        System.out.println(avgWaitingTime(customers));
    }
}
