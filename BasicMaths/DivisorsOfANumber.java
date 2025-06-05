
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DivisorsOfANumber {
    public static void divisors (int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                list.add(n / i);
            }
        }
        
        Collections.sort(list);
        System.out.println(list);
    }

    public static void main(String[] args) {
        divisors(56);
    }
}
