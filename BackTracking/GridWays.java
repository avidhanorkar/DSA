// To find the number of ways to reach (N-1, M-1) from (0, 0) in a NxM ways 
// The allowed ways to move are: Right, Down 

package BackTracking;
public class GridWays {

    static int gridWays(int i, int j, int N, int M){
        if (i == N - 1 && j == M - 1){
            return 1;
        } else if (i == N - 1 || j == M - 1){
            return 1;
        }

        int w1 = gridWays(i + 1, j, N, M);
        int w2 = gridWays(i, j + 1, N, M);
        return w1 + w2;
    }

    public static void main(String[] args) {
        int N = 3;
        int M = 3;

        System.out.println(gridWays(0, 0, N, M));
    }
}
