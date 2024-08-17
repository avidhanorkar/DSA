package Queues;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class QueueUsingArray {
    int[] arr;
    int size;
    int rear;

    QueueUsingArray(int n) {
        arr = new int[n];
        size = n;
        rear = -1;
    }

    boolean isEmpty() {
        return rear == -1;
    }

    void Enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
            return;
        } else {
            rear = rear + 1;
            arr[rear] = data;
        }
    }

    int Dequeue() {
        if (isEmpty()) {
            System.out.println("There is nothing to remove.");
            return -1;
        } else {
            int temp = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return temp;
        }
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("There is nothing to peek.");
        }
        return arr[0];
    }

    void printQueue() {
        for (int i = 0; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class QueueUsingLinkedList {
    Node head = null;
    Node tail = null;

    public boolean isEmpty() {
        return head == null;
    }

    public void Enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
            return;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public int Dequeue() {
        if (isEmpty()) {
            System.out.println("There is nothing to remove.");
            return -1;
        }
        int data = head.data;
        head = head.next;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("There is nothing to peek.");
            return -1;
        }
        return head.data;
    }

    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}

class QueueUsingStacks {
    Stack<Integer> S1 = new Stack<>();
    Stack<Integer> S2 = new Stack<>();

    public boolean isEmpty() {
        return S1.isEmpty() && S2.isEmpty();
    }

    public void Enqueue(int data) {
        if (isEmpty()) {
            S1.push(data);
        } else {
            while (!S1.isEmpty()) {
                S2.push(S1.pop());
            }
            S1.push(data);
            while (!S2.isEmpty()) {
                S1.push(S2.pop());
            }
        }
    }

    public int Dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return S1.pop();
    }

    int peekQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return S1.peek();
    }

}

public class QueueImplementation {

    public static void main(String[] args) {
        QueueUsingArray qArr = new QueueUsingArray(5);
        System.out.println("-------------------------Array Implementation of Queue-------------------------");
        qArr.Enqueue(1);
        qArr.Enqueue(2);
        qArr.Enqueue(3);
        qArr.Enqueue(4);
        qArr.Enqueue(5);
        qArr.printQueue();
        qArr.Dequeue();
        qArr.printQueue();
        System.out.println(qArr.peek());

        QueueUsingLinkedList qLL = new QueueUsingLinkedList();
        System.out.println("-------------------------Linked List Implementation of Queue-------------------------");
        qLL.Enqueue(1);
        qLL.Enqueue(2);
        qLL.Enqueue(3);
        qLL.Enqueue(4);
        qLL.Enqueue(5);
        qLL.printLL();
        qLL.Dequeue();
        qLL.printLL();
        System.out.println(qLL.peek());

        System.out
                .println("-------------------------Implementation of Queue using Collections-------------------------");
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        System.out.println(que);
        que.remove();
        System.out.println(que);
        System.out.println(que.peek());

        System.out.println("-------------------------Implementation of Queue using Stacks-------------------------");
        QueueUsingStacks qStacks = new QueueUsingStacks();
        qStacks.Enqueue(1);
        qStacks.Enqueue(2);
        qStacks.Enqueue(3);
        qStacks.Enqueue(4);
        qStacks.Enqueue(5);
        while (!qStacks.isEmpty()) {
            System.out.print(qStacks.Dequeue() + " ");
        }
        System.out.println();
    }
}
