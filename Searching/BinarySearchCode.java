package Searching;
public class BinarySearchCode {
    // Requires a sorted array
    // Time Complexity: O(log N)
    // Space Complexity: O(1) - constant
    public static int binarySearch(int arr[], int target) {
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            int mid = (i + j) / 2;

            if (target < arr[mid]) {
                j = mid - 1;
            } else if (target > arr[mid] ) {
                i = mid + 1;
            } else {
                return target;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(binarySearch(arr, 8));
        System.out.println(binarySearch(arr, 11));
    }
}
