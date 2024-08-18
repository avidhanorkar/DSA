// Given an array, arr. The task is to find the largest element in it.
public class LargestElementInArray {

    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Solution.largest(arr));
    }
}

class Solution {
    public static int largest(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++){
            max = Math.max(arr[i], max);
        }
        
        return max;
    }
}
