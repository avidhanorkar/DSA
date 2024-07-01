import java.util.Scanner;
public class Matrix {
    
    public static void search2DArr(int arr[][],int key, int rows, int cols){
        boolean found = false;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if (arr[i][j] == key){
                    System.out.println("The key: " + key + " is found at cell (" + i +", " + j + ")" );
                    found = true;
                } 
            }
        }

        if (!found){
            System.out.println("Not Found: 404");
        }
    }

    public static int maxIn2D(int arr[][], int rows, int cols){
        int maxEle = Integer.MIN_VALUE;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                maxEle = Math.max(maxEle, arr[i][j]);
            }
        }
        return maxEle;
    }

    public static int minIn2D(int arr[][], int rows, int cols){
        int minEle = Integer.MAX_VALUE;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                minEle = Math.min(minEle, arr[i][j]);
            }
        }
        return minEle;
    }

    public static void main (String args[]){
        // 2D array creation
        int rows = 2;
        int cols = 3;
        int arr[][] = new int[rows][cols];

        // Taking input for 2D arr;
        System.out.println("Enter the elements of the array");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();

        // Printing 2D Array
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Searching 5 in 2D array
        System.out.println("Searching Element: 5 In Array");
        search2DArr(arr, 5, rows, cols);

        System.out.print("Finding the Maximum Element in the array: ");
        System.out.println(maxIn2D(arr, rows, cols));

        System.out.print("Finding the Minimum Element in the array: ");
        System.out.println(minIn2D(arr, rows, cols));
    }

}
