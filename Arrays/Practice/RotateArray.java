package Arrays.Practice;

import java.util.Arrays;

public class RotateArray {
    // public static void rotateArray(int[] arr, int k) {
    //     int n = arr.length;
    //     while (k != 0) {
    //         int last = arr[n - 1];
    //         for (int i = n - 1; i >= 1; i--) {
    //             arr[i] = arr[i - 1];
    //         }
    //         arr[0] = last;
    //         System.out.println(Arrays.toString(arr));

    //         k--;
    //     }
    // }

    public static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        int newnums[] = new int[n];

        for (int i = 0; i < n; i++) {
            newnums[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = newnums[i];
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String args[]) {
        int arr[] = {0, 0, 1, 3, 12};
        
        rotateArray(arr, 3);
    }
}
