// Given an array of integers nums containing n elements, where n is the length of the array, find the missing number in the sequence. The sequence is assumed to be consecutive integers starting from 0.

public class MissingNumber {
    static class Solution {
        public int missingNumber(int[] nums) {
            int n = nums.length;
            int sum = 0;
            for (int i = 0; i <= n; i++){
                sum = sum + i;
            }
            int sumElem = 0;
            for (int i = 0 ; i < n; i++){
                sumElem = sumElem + nums[i];
            }
    
            return sum - sumElem;
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0,1,3};
        System.out.println(solution.missingNumber(nums));
    }
}
