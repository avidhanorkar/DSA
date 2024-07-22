public class QuickSort {
  public static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
  }

  public static void printArr(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void quickSort(int arr[], int si, int ei) {
    if (si >= ei) { // Base case: sub-array with zero or one element
      return;
    }

    int pIdx = partition(arr, si, ei);
    quickSort(arr, si, pIdx - 1); // Sort left sub-array (elements less than pivot)
    quickSort(arr, pIdx + 1, ei); // Sort right sub-array (elements greater than pivot)
  }

  public static int partition(int arr[], int si, int ei) {
    int pivot = arr[ei];
    int i = si - 1;
    for (int j = si; j < ei; j++) { // Iterate within the sub-array
      if (arr[j] <= pivot) {
        i++;
        swap(arr[i], arr[j]);
      }
    }
    // pivot swapping
    i++;
    int temp = pivot;
    arr[ei] = arr[i];
    arr[i] = temp;
    return i;
  }

  public static void main(String[] args) {
    int[] arr = {6, 3, 2, 4, 9, 5};
    System.out.println("here is your array before sorting: ");
    printArr(arr);
    System.out.println("Sorted Array: ");
    quickSort(arr, 0, arr.length - 1);
    printArr(arr);
  }
}
