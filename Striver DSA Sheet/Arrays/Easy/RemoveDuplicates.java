// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

import java.util.Arrays;

public class RemoveDuplicates {
    static class Solution {
        public int removeDuplicates(int[] nums) {
            int count = 0;
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]==nums[i+1]){
                    nums[i]=Integer.MAX_VALUE;
                    count=count+1;
                }
            }
            System.out.println(count);
            Arrays.sort(nums);
            return nums.length-count;
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4};   
        Solution solution = new Solution();
        int result = solution.removeDuplicates(nums);
        System.out.println(result);
    }
}
