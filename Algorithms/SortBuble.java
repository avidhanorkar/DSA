import java.util.Arrays;

// Time Complexity: O(n2)
// Space Complexity: O(1)
public class SortBuble {
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 2, 7, 3, 4, 6, 5 };

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
