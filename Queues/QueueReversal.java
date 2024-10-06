import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class QueueReversal {
    public void reverseQueue(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty()) {
            st.push(q.peek());
            q.remove();
        }
        while (!st.isEmpty()) {
            q.add(st.peek());
            st.pop();
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            q.add(arr[i]);
        }

        // Queue Print Before Reversal
        System.out.print("Queue Before Reversal: ");
        for (int i = 0; i < 10; i++) {
            int a = q.peek();
            System.out.print(a + " ");
            q.remove();
            q.add(a);
        }
        System.out.println();

        QueueReversal qr = new QueueReversal(); // Create an instance of QueueReversal
    qr.reverseQueue(q); 
    
        //  Queue Print After Reversal
        for (int i = 0; i < 10; i++) {
            int a = q.peek();
            System.out.print(a + " ");
            q.remove();
            q.add(a);
        }
        System.out.println();
    }
}
