public class FastExponentiation {
    
    public static int fastExp(int a, int N){
        int ans = 1;

        while (N > 0){
            if ((N & 1) == 1){
                ans = a * ans;
            }
            a = a * a;
            N = N >> 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastExp(5, 4));
    }
}
