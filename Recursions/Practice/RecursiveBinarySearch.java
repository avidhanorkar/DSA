package Recursions.Practice;

public class RecursiveBinarySearch {

    public static int binarySearch(int arr[], int left, int right, int target) {
        int mid = (left + right) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, right, target);
        } else {
            return binarySearch(arr, left, mid - 1, target);
        }
    }

    public static void main(String args[]) {
        int arr[] = {
            1, 3, 4, 7, 8, 10, 46, 78
        };

        System.out.println(binarySearch(arr, 0, arr.length, 46)); 
    }
}