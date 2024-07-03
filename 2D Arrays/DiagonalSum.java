import java.util.Scanner;

public class DiagonalSum {
    public static void diagonalSum(int arr[][], int rows, int cols){
        int a = 0;
        for (int i = 0; i < rows; i++){
            a += arr[i][i];
        }

        int b = 0;
        for (int i = rows - 1; i >= 0; i--){
            b += arr[i][i];
        }

        System.out.println("The sums of both the diagonal elements in the array are: " + a + ", " + b);
    }

    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
        int arr[][] = new int[rows][cols];

        System.out.print("Enter the elements of the array: ");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println();

        System.out.println("The array is: ");
        // Printing 2D Array
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        diagonalSum(arr, rows, cols);
    }
}
