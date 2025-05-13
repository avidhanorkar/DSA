package Sorting;
import java.util.Arrays;

public class SortSelection {

    // helper method
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // implementation
    public static void selectionSort(int arr[]) {
        int n = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            int max = 0;

            for (int j = 0; j <= n; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }
            swap(arr, max, n);
            n--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 2, 7, 3, 4, 6, 5 };

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
