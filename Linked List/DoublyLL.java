public class DoublyLL {
    public static class Node {
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
            prev = null;
            next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public static void addLast(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public static void removeFirst(){
        if (head == null){
            System.out.println("List is empty.");
            return;
        } else if (head.next == null){
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
        
    }

    public static void removeLast(){
        if (head == null){
            System.out.println("List is empty.");
            return;
        } else if (head.next == null) {
            head = tail = null;
            return;
        }
        Node temp = tail.prev;
        temp.next = null;
        tail = temp;
    }

    public static void printDLL(){
        Node temp = head;
        if (head == null){
            System.out.println("The List is Empty.");
            return;
        }
        while (temp.next != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    } 

    public static void main(String args[]){
        DoublyLL.addFirst(0);
        DoublyLL.addFirst(1);
        DoublyLL.addFirst(2);
        DoublyLL.addLast(3);
        DoublyLL.addLast(4);
        DoublyLL.printDLL();
        // Removing the Elements
        DoublyLL.removeFirst();
        DoublyLL.removeLast();
        DoublyLL.printDLL();
    }
}
