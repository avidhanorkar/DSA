import java.util.LinkedList;
import java.util.Queue;

class Stack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    boolean isEmpty() {
        return q1.isEmpty() && q2.isEmpty();
    }

    void push(int data) {
        if (!q1.isEmpty()) {
            q1.add(data);
        } else if (!q2.isEmpty()) {
            q2.add(data);
        } else {
            q1.add(data);
        }
    }

    int pop() {
        int top = 0;
        if (isEmpty()) {
            return -1;
        } else {
            if (q1.isEmpty()) {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            } else {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            }
        }
        return top;
    }

    int peek() {
        int top = 0;
        if (isEmpty()) {
            return -1;
        }
        if (q1.isEmpty()) {
            while (!q2.isEmpty()) {
                top = q2.remove();
                q1.add(top);
            }
        } else {
            while (!q1.isEmpty()) {
                top = q1.remove();
                q2.add(top);
            }
        }
        return top;
    }

public class StackUsingTwoQueues {
    public static void main(String[] args) {
        Stack stack = new Stack();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        System.out.println("Peek: " + stack.peek()); // Output: 5
        System.out.println("Pop: " + stack.pop()); // Output: 5
        System.out.println("Peek: " + stack.peek()); // Output: 4
        System.out.println("Pop: " + stack.pop()); // Output: 4
        System.out.println("Pop: " + stack.pop()); // Output: 3
        System.out.println("Pop: " + stack.pop()); // Output: 2
        System.out.println("Pop: " + stack.pop()); // Output: 1
        System.out.println("Pop: " + stack.pop()); // Output: -1 (Stack is empty)
    }
}
