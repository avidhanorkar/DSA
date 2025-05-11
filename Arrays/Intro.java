package Arrays;

public class Intro {
    public static void main(String[] args) {
        // Arrays are the collection of similar data types
        // Arrays are fixed in size
        // Arrays are indexed from 0 to n-1 where n being the size of the array
        // Arrays are mutable
        // Arrays are stored in contiguous memory locations
        // Arrays are reference data types
        // Arrays are objects

        // Array Creation 
        int[] arr = new int[5];
        // You can use the following syntax to initialize an array
        int[] arr1 = new int[]{1, 2, 3, 4, 5}; // This is valid

        // Inputing the array
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = i*2;
        }

        // Printing the array
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


    }
}
