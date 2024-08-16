import java.util.Stack;

public class StockSpanProblem {

    public static void stockSpan(int[] prices, int[] span) {
        Stack<Integer> st = new Stack<>();
        span[0] = 1;
        st.push(0);

        for (int i = 1; i < prices.length; i++) {
            while (!st.isEmpty() && prices[st.peek()] <= prices[i]) {
                st.pop();
            }

            span[i] = st.isEmpty() ? i + 1 : i - st.peek();
            st.push(i);
        }
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 85, 100};
        int[] span = new int[prices.length];
        stockSpan(prices, span);

        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}