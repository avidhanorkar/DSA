public class MergeSort {
    public static void printArr(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void mergeSort(int arr[], int si, int ei){
        if (si >= ei){
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);  // sorting left part
        mergeSort(arr, mid+1, ei);  // sorting right part
        merge(arr, si, mid, ei);  // merging the array
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei - si + 1];
        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp arr


        while (i <= mid && j <= ei){
            if (arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid){
            temp[k] = arr[i];
            k++; i++;
        }

        while (j <= ei){
            temp[k] = arr[j];
            k++; j++;
        }
        for (k = 0, i = si; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]){
        int arr[] = {6, 3, 9, 5, 2, 8};
        System.out.print("the arr before sorting: ");
        printArr(arr);
        mergeSort(arr, 0, arr.length-1);
        System.out.println("Sorted Array: ");
        printArr(arr);
    }

}
 