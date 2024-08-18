// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

public class MoveZeros {
    static class Solution {
        public void moveZeroes(int[] nums) {
            int j = 0;
            for (int i = 0; i < nums.length; i++){
                if (nums[i] != 0){
                    nums[j] = nums[i];
                    j++;
                }
            }
    
            while(j < nums.length){
                nums[j] = 0;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        Solution solution = new Solution();
        solution.moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
