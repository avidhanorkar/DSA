class Queue {
    int arr[];
    int front;
    int rear;
    int size;

    Queue(int n) {
        arr = new int[n];
        size = n;
        front = rear = -1;
    }

    // Operation to check if the Queue is Empty
    boolean isEmpty() {
        if (rear == -1) {
            return true;
        }
        return false;
    }

    // Operation to check if the Queue is Full
    boolean isFull() {
        if (rear == size - 1) {
            return true;
        }
        return false;
    }

    // Operation to add elements in the Queue i.e. Enqueue
    // O(1)
    void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("The queue is full");
            return;
        }
        rear = rear + 1;
        arr[rear] = data;
    }

    // operation to remove an element from the front of the Queue i.e. Dequeue
    // O(n)
    int dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return -1;
        }
        int data = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return data;
    }

    // Operation to get the data of Queue at the front
    // O(1)
    int peek() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return -1;
        }
        return arr[0];
    }
}

public class QueueUsingArray {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.print("Queue: ");
        for (int i = 0; i <= q.rear; i++) {
            System.out.print(q.arr[i] + " ");
        }
        System.out.println();

        // Peeking the Queue
        System.out.println("Peek: " + q.peek());

        // Dequeuing the Queue
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());

        // New Queue after dequeuing
        System.out.print("Queue: ");
        for (int i = 0; i <= q.rear; i++) {
            System.out.print(q.arr[i] + " ");
        }
        System.out.println();
    }
}