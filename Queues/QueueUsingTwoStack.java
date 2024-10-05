import java.util.Stack;

class QueueUsingStacks {
    Stack<Integer> S1 = new Stack<>();
    Stack<Integer> S2 = new Stack<>();

    int size = 0;

    boolean isEmpty() {
        return S1.isEmpty();
    }

    void enqueue(int data) {
        if (S1.isEmpty()) {
            S1.push(data);
        } else {
            while (!S1.isEmpty()) {
                int tempData = S1.pop();
                S2.push(tempData);
            }
            S1.push(data);
            while (!S2.isEmpty()) {
                int tempData = S2.pop();
                S1.push(tempData);
            }
        }
        size ++;
    }

    int dequeue() {
        if (isEmpty()) {
            return  -1;
        } return S1.pop();
    }

    int peek() {
        if (isEmpty()) {
            return -1;
        }  return S1.peek();
    }
}

public class QueueUsingTwoStack {
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued element: " + queue.dequeue()); // prints 10
        System.out.println("Peek element: " + queue.peek()); // prints 20
        System.out.println("Is queue empty? " + queue.isEmpty()); // prints false

        System.out.println("Dequeued element: " + queue.dequeue()); // prints 20
        System.out.println("Dequeued element: " + queue.dequeue()); // prints 30
        System.out.println("Is queue empty? " + queue.isEmpty()); // prints true
    }
}