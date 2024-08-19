// Given an array of binary integers, write a function to find the maximum number of consecutive 1s in the array.
public class findMaxConsecutive1s{
    static class Solution {
        public int findMaxConsecutiveOnes(int[] arr) {
            int count = 0;
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    count ++;
                } else if (arr[i] != 1) {
                    max = Math.max(max, count);
                    count = 0;
                }
            }
    
            return Math.max(max, count);
        }
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        int[] arr = {1, 1, 0, 1, 1};
        System.out.println("Maximum consecutive 1s: " + solution.findMaxConsecutiveOnes(arr));
    }
}
