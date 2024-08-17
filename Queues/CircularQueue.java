package Queues;

class CircularQueueUsingArr{
    int front;
    int rear;
    int size;
    int[] arr;

    CircularQueueUsingArr(int n){
        size = n;
        arr = new int[n];
        rear = -1;
        front = -1;
    }

    boolean isEmpty(){
        return rear == -1 && front == -1;
    }

    boolean isFull(){
        return (rear+1)%size == front;
    }

    void Enqueue(int data){
        if (isEmpty()){
            front = 0;
            rear = 0;
            arr[rear] = data;
            return;
        } else if (isFull()){
            System.out.println("Queue is full");
            return;
        }
        arr[rear] = data;
        rear = (rear+1)%size;
    }

    int Dequeue(){
        if (isEmpty()){
            System.out.println("The queue is empty.");
            return -1;
        }
        int temp = arr[front];
        if (front == rear){
            front = -1;
            rear = -1;
        } else {
            front = (front+1)%size;
        }
        return temp;
    }

    int peek(){
        if (isEmpty()){
            System.out.println("The queue is empty.");
            return -1;
        }
        return arr[front];
    }
    void printQueue(){
        if (isEmpty()){
            System.out.println("The queue is empty.");
            return;
        }
        int i = front;
        while (true){
            System.out.print(arr[i] + " ");
            if (i == rear){
                break;
            }
            i = (i+1)%size;
        }
        System.out.println();
    }
}

public class CircularQueue {
    public static void main(String[] args) {
       CircularQueueUsingArr q = new CircularQueueUsingArr(5);
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
        q.Enqueue(5);
        q.Dequeue();
        q.printQueue();
        System.out.println(q.peek());

    }
}
