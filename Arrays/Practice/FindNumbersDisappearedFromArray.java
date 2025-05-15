package Arrays.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindNumbersDisappearedFromArray {

    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static List<Integer> findDisappearedNumbers(int arr[]) {
        List<Integer> list = new ArrayList<>();

        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                list.add(j + 1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1}; 
        List<Integer> list = findDisappearedNumbers(arr);

        System.out.println(Arrays.toString(list.toArray()));
    }
}
