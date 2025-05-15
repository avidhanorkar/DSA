package Arrays.Practice;

import java.util.Arrays;

public class MissingNumber {
    // public static int missingNumber(int[] nums) {
    // Arrays.sort(nums);

    // int sum = 0;
    // for (int i = 0; i < nums.length; i++) {
    // if (nums[i] != sum) {
    // return sum;
    // }
    // sum++;
    // }

    // return nums.length;
    // }

    public static int missingNumber(int nums[]) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }

        return nums.length;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 0, 1 };
        int missingNumber = missingNumber(nums);
        System.out.println("Missing number is: " + missingNumber);

        int nums2[] = { 0, 1 };
        int missingNumber2 = missingNumber(nums2);
        System.out.println("Missing number is: " + missingNumber2);

        int nums3[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        int missingNumber3 = missingNumber(nums3);
        System.out.println("Missing number is: " + missingNumber3);
    }
}
