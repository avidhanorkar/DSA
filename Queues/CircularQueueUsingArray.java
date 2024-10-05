class Queue {
    int front, rear, size;
    int arr[];

    Queue(int n) {
        arr = new int[n];
        size = n;
        rear = -1;
        front = 0;
    }

    boolean isEmpty() {
        if (rear == -1) {
            return true;
        }
        return false;
    }

    void enqueue(int data) {
        if (front == (rear + 1) % size) {
            System.out.println("The queue is full.");
            return;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    int dequeue() {
        if (isEmpty()) {
            return -1;
        }

        int data = arr[front];
        front = (front + 1) % size;
        return data;
    }

    int  peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }
}

class CircularQueueUsingArray{
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

        q.enqueue(10);
        q.enqueue(20);
        // New Queue after dequeuing
        System.out.print("Queue: ");
        for (int i = 0; i <= q.rear; i++) {
            System.out.print(q.arr[i] + " ");
        }
        System.out.println();
    }
}