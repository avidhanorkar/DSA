// Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

public class CheckingIfSortedRotatedArray {
    static class Solution {
        public boolean check(int[] arr) {
            int i = 1;
            int n = arr.length;
            
            // getting the pivot point where the array  was rotated
            while(i < n){
                if(arr[i] < arr[i-1]){
                    break;
                } else {
                    i++;
                }
            }

            // if loop didn't break then it means that the loop is sorted and not rotated.
            if (i == n){
                return true;
            }

            for (int j = i; j < n - 1; j++){
                if (arr[j] > arr[j+1]){
                    return false;
                }
            }

            if (arr[n-1] > arr[0]){
                return false;
            }

            return true;
        }
    }


    public static void main(String args[]){
        Solution solution = new Solution();
        int[] arr = {2, 3, 1, 4};
        System.out.println(solution.check(arr));
    }
}
