// Requires Hashmap for optimization

public class LongestSubArrayWithSumK {
    public static int lenOfLongSubarr(int arr[], int n, int k) {
        // Complete the function
        int output = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                count++;
                if (sum == k){
                    output = Math.max(output, count);
                    return output;
                }
                else if (sum > k){
                    break;
                }
            }
        }
        
        return output;
    }


    public static void main(String[] args) {
        int arr[] = {10, 2, -2, -20, 10};
        int n = arr.length;
        int k = 12;
        System.out.println("Length of the longest subarray with sum K is " + lenOfLongSubarr(arr, n, k));
    }
}
