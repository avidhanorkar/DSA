// To place N queens on NxN ChessBoard such that no queen can attack each other

package BackTracking;

import java.util.Scanner;

public class NQueens {

    public static boolean isSafe(String arr[][], int row, int col){
        // vertical Up checking
        for (int i = row - 1; i >= 0; i--){
            if (arr[i][col] == "Q"){
                return false;
            }
        }

        // digonal left checking
        for (int i = row - 1, j = col - 1; i >=0 && j >=0; i--, j--){
            if (arr[i][j] == "Q"){
                return false;
            }
        }

        // diagonal right checking
        for (int i = row - 1, j = col + 1; i >= 0 && j < arr.length; i--, j++){
            if (arr[i][j] == "Q"){
                return false;
            }
        }
        return true;
    }

    public static void nQueens(String arr[][], int row){
        if (row == arr.length){
            printChessBoard(arr);
        }
        for (int i = 0; i < arr.length; i++){
            if (isSafe(arr, row, i)){
                arr[row][i] = "Q";
                nQueens(arr, row + 1);
                arr[row][i] = "X";
            }
        }
    }

    public static void printChessBoard(String arr[][]) {
        int N = arr.length;
        System.out.println("---------------------ChessBoard---------------------");
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String chessBoard[][] = new String[N][N];
    sc.close();
    // chessBoard initialization
    for (int i = 0; i < N; i++){
        for (int j = 0; j < N; j++){
            chessBoard[i][j] = "X";
        }
    }

    nQueens(chessBoard, 0);
    }
}
