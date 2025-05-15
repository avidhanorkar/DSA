package Sorting;

import java.util.Arrays;

// When To use Cyclic Sort: 
    // When numbers are given from 1 to N.
// Time Complexity: O(n)
// Space Complexity: O(1)
public class CyclicSort {
    
    public static void swap (int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int[] cyclicSort(int arr[]) {
        int i = 0;
        while ( i < arr.length) {
            if (arr[i] != i + 1) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
         
        
        return arr;
    }


    public static void main (String args[]) {
        int[] arr = {3, 5, 2, 1, 4};

        System.out.println(Arrays.toString(cyclicSort(arr)));
    }
}
