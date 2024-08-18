// Given an array arr, return the second largest distinct element from an array. If the second largest element doesn't exist then return -1

public class SecondLargestElement {

    static class Solution {
        public static int secondlargest(int[] arr) {
            // Code Here
            int max = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            
            for (int i = 0; i < arr.length; i++){
                if (arr[i] > max){
                    max2 = max;
                    max = arr[i];
                } else if (arr[i] > max2 && arr[i] < max) {
                    max2 = arr[i];
                }
            }
            
            return max2;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Solution.secondlargest(arr));
    }
}

