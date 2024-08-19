// Given an array of integers, write a program to find the single number that appears only once in the array. The array contains all numbers twice except for one number which appears only once.
import java.util.*;
public class SingleNumber {
    static class Solution {
        public int singleNumber(int[] arr) {    
            int result = 0;
            for (int i = 0; i < arr.length; i++){
                result ^= arr[i];
            }
            return result;
        }
    }

    public static void main(String args[]) {
        int[] arr = {2, 2, 1};
        Solution solution = new Solution();
        System.out.println(solution.singleNumber(arr));

    }
}
