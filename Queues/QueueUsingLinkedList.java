class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyQueue {
    Node front, rear;
    int size;

    MyQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    boolean isEmpty() {
        if (front == null && rear == null) {
            return true;
        }
        return false;
    }

    void enqueue(int data) {
        Node newNode = new Node(data);
        if (front == null && rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    int dequeue() {
        if (front == null && rear == null) {
            return -1;
        }
        int data = front.data;
        front = front.next;
        size --;
        if (front == null) {
            rear = null;
        }
        return  data;
    }

    int peek() {
        if (front == null && rear == null) {
            return -1;
        }
        return front.data;
    }
}
public class QueueUsingLinkedList {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        // Test isEmpty() method
        System.out.println("Is queue empty? " + queue.isEmpty());

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        // Print queue elements
        System.out.print("Queue elements: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.peek() + " ");
            queue.dequeue();
        }
        System.out.println();

        // Test isEmpty() method again
        System.out.println("Is queue empty? " + queue.isEmpty());

        // Enqueue elements again
        queue.enqueue(60);
        queue.enqueue(70);
        queue.enqueue(80);
        queue.enqueue(90);
        queue.enqueue(100);

        // Test peek() method
        System.out.println("Front element: " + queue.peek());

        // Dequeue elements
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());

        // Print queue elements
        System.out.print("Queue elements: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.peek() + " ");
            queue.dequeue();
        }
        System.out.println();

        // Test isEmpty() method again
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}