// Given an array arr[] sorted in ascending order of size N and an integer K. Check if K is present in the array or not.
public class LinearSearch {
    static class Solution {
        static int searchInSorted(int arr[], int N, int K) {
            int status = -1;
            // Your code here
            for (int i = 0; i < N; i++){
                if (K == arr[i]){
                    return 1;
                } 
            }
            return status;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int N = arr.length;
        int K = 3;
        int result = Solution.searchInSorted(arr, N, K);
        System.out.println(result);
    }
}
