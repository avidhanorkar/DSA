public class RotateArray {
    static class Solution {

        public void rotate(int[] nums, int k){
        k = k % nums.length; // take the modulus of k with the length of the array
        int n = nums.length;
        int arr[] = new int[k];
    
        for (int i = 0; i < k; i++){
            arr[i] = nums[nums.length - k + i];
        }
    
        for (int i = nums.length - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }
        for (int i = 0; i < arr.length; i++){
            nums[i] = arr[i];
        }
    }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        solution.rotate(nums, k);
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
