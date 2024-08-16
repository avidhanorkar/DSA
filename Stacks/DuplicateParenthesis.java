import java.util.Stack;

public class DuplicateParenthesis {

    public static boolean isDuplicateParenthesis(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == ')') {
                int count = 0;
                while (!st.isEmpty() && st.peek() != '(') {
                    st.pop();
                    count++;
                }
                st.pop(); // Remove the opening parenthesis
                if (count <= 1) {
                    return true; // Duplicate parenthesis found
                }
            } else {
                st.push(ch);
            }
        }
        return false; // No duplicate parentheses found
    }

    public static void main(String[] args) {
        String s = "(a+b)";
        System.out.println(isDuplicateParenthesis(s));
    }
}