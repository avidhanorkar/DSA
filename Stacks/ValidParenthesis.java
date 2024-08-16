import java.util.Stack;

public class ValidParenthesis {
    
    public static boolean isValid(String s){
        boolean valid = true;
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                st.push(s.charAt(i));
            } else{
                if (st.isEmpty()){
                    valid = false;
                } else if ((s.charAt(i) == ')' && st.peek() == '(') || (s.charAt(i) == ']' && st.peek() == '[') || (s.charAt(i) == '}' && st.peek() == '{') ){
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return valid;
    }

    public static void main(String[] args) {
        String s = "({[]}())";
        System.out.println("The validity of the string is: " + isValid(s));
    }
}
