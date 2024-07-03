import java.util.Scanner;

public class SprialMatrixQuestion {

    public static void spiralMatrix(int arr[][], int row, int col) {
        int startingRow = 0;
        int startingCol = 0;
        int endingRow = row - 1;
        int endingCol = col - 1;
        int dir = 0; // Direction (0: right, 1: down, 2: left, 3: up)

        while (startingRow <= endingRow && startingCol <= endingCol) {
            switch (dir) {
                case 0: // Move right
                    for (int j = startingCol; j <= endingCol; j++) {
                        System.out.print(arr[startingRow][j] + " ");
                    }
                    startingRow++;
                    break;
                case 1: // Move down
                    for (int i = startingRow + 1; i <= endingRow; i++) {
                        System.out.print(arr[i][endingCol] + " ");
                    }
                    endingCol--;
                    break;
                case 2: // Move left
                    for (int j = endingCol; j >= startingCol; j--) {
                        System.out.print(arr[endingRow][j] + " ");
                    }
                    endingRow--;
                    break;
                case 3: // Move up
                    for (int i = endingRow - 1; i > startingRow; i--) {
                        System.out.print(arr[i][startingCol] + " ");
                    }
                    startingCol++;
            }
            dir = (dir + 1) % 4; // Update direction for next iteration
        }
    }

    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
        int arr[][] = new int[rows][cols];

        System.out.print("Enter the elements of the array");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();
        spiralMatrix(arr, rows, cols);
    }
}
