public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                    return arr; 
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {2,7,11,15}; // example array
        int k = 9; // example target sum
        int[] result = new int[2];
        result = twoSum(arr, k);
        
        // print result
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
