import java.util.ArrayList;
import java.util.Stack;
// Implementation of Stacks using ArrayLists
class ArrayListStack{
    ArrayList<Integer> list = new ArrayList<>();

    public boolean isEmpty(){
        if (list.size() == 0){
            return true;
        } 
        return false;
    }

    public void push(int data){
        list.add(data);
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("The stack is empty!");
            return 0; 
        }
        int data = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return data;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("The stack is empty!");
            return 0;
        }
        return list.get(list.size() - 1);
    }
}

// Stack Implementation using Linked List
class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedListStack{
    Node head = null;
    
    boolean isEmpty(){
        if (head == null) {
            return true;
        } 
        return false;
    } 

    // push operation
    public void push (int data){
        Node newNode = new Node (data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // pop operation
    public int pop(){
        if (head == null){
            System.out.println("The stack is empty!");
            return -1;
        }
        int data = head.data;
        head = head.next;
        return data;
    }


    // peek operation
    public int peek(){
        if (head == null){
            System.out.println("The stack is empty!");
            return -1;
        }
        return head.data;
    }
}


public class Stacks{
    public static void main(String[] args){
        // Implementation using ArrayLists
        System.out.println("Stack using ArrayLists: ");
        ArrayListStack st = new ArrayListStack();
        st.push(10);
        st.push(20);
        st.push(30);
        while (!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
        System.out.println();

        // Implementation using LinkedLists
        System.out.println("Stack using LinkedList: ");
        LinkedListStack llst = new LinkedListStack();
        llst.push(1);
        llst.push(2);
        llst.push(3);
        while (!llst.isEmpty()){
            System.out.println(llst.peek());
            llst.pop();
        }
        System.out.println();

        // Implementation using Java Collections
        System.out.println("Stack Using Java Collection");
        Stack<Integer> s = new Stack<>();
        s.push(100);
        s.push(200);
        s.push(300);
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}