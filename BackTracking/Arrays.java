package BackTracking;
// Backtracking on Arrays

// Que: Given an empty array of size n and create a recursive function to store elements increasingly from 1 to n in the array. 

public class Arrays {

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void fillArrays(int arr[], int i){
        int n = arr.length;
        if (i >= n){
            printArr(arr);
            return;
        }

        arr[i] = i + 1;

        fillArrays(arr, i+1);
        arr[i] = arr[i] - 2;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];

        fillArrays(arr, 0);
        printArr(arr);
    }
}
