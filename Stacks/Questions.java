import java.util.Stack;

public class Questions {
    public static void printStack(Stack<Integer> s){
        for (int elem : s){
            System.out.print(elem + " ");
        }
        System.out.println();
    } 


    // Question: Create a function to push an item at the bottom of the stack
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    // Question: Create a function to reverse a string using a stack
    public static void reverseUsingStack(String str){
        Stack<Character> s = new Stack<>();
        int j = 0;
        while (j < str.length()){
            s.push(str.charAt(j));
            j++; 
        }
        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()){
            sb = sb.append(s.pop());
        }
        str = sb.toString();
        System.out.println("The reversed String is: " + str);
    }

    // Question Reverse A Stack
    public static Stack<Integer> reverseStack(Stack<Integer> st){
        Stack<Integer> temp = new Stack<>();
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        return temp;
    }

    public static Stack<Integer> reverseRecStack(Stack<Integer> s){
        if (s.isEmpty()){
            return s;
        }
        int top = s.pop();
        reverseRecStack(s);
        pushAtBottom(s, top);
        return s;
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.print("The OG stack is: ");
        printStack(st);
        
        pushAtBottom(st, 4);
        System.out.print("The stack after pushing 4 at the bottom is: ");
        printStack(st);
        
        st = reverseStack(st);
        System.out.print("The reversed stack is: ");
        printStack(st);

        String str = "Avishkar";
        System.out.println("The OS string is: " + str);
        reverseUsingStack(str);

    }
}
