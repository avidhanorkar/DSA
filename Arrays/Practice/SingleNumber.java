package Arrays.Practice;

import java.util.Arrays;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        int nums[] = {4, 1, 2, 1, 2};
        int singleNumber = singleNumber(nums);
        System.out.println("Single number is: " + singleNumber);

        int nums2[] = {2, 2, 1};
        int singleNumber2 = singleNumber(nums2);
        System.out.println("Single number is: " + singleNumber2);

        int nums3[] = {1};
        int singleNumber3 = singleNumber(nums3);
        System.out.println("Single number is: " + singleNumber3);
    }
}
