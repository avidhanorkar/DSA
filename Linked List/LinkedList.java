public class LinkedList {
    // Structure of the Node in the LinkedList
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Method to add the elements at the start of the Linked List
    public static void addElemAtFirst(int data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Method to add the elements at the end of the linked list
    public static void addElemAtLast(int data) {
        size++;
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Method to Print the Elements of the Linked List
    public static void printLinkedList(){
        if (head == null){
            System.out.println("Linked List is Empty");
        }
        Node temp = head;
        while (temp.next != null){
            System.out.print(temp.data + " -> "); 
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    // Method to add the element at a random position
    public static void addElemAtRandom(int index, int data){
        if (index == 0){
            addElemAtFirst(data);
            return;
        }
        size++;
        Node temp = head;
        Node newNode = new Node(data);
        for (int i = 0; i <=  index; i++){
            if (i == index-1){
                newNode.next = temp.next;                
                temp.next = newNode;
            } else {
                temp = temp.next; 
            }
        }
    }

    // Method to remove the element which is the head of the linked list
    public static void removeHead(){
        head = head.next;
        size --;
    }

    // Method to remove the element which is the tail of the linked list
    public static void removeTail(){
        if (size == 0){
            System.out.println("Linked List is Empty");
        } else if (size == 1){
            head = null;
            tail = null;
        } else {
            Node temp = head;
            for (int i = 0; i < size-2; i++){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
        size --;
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addElemAtFirst(10);
        ll.addElemAtFirst(20);
        ll.addElemAtFirst(30);
        ll.addElemAtLast(40);
        ll.addElemAtLast(50);
        ll.addElemAtRandom(2, 25);
        ll.printLinkedList();
        System.out.println("Size of the Linked List is: " +ll.size);
        ll.removeHead();
        System.out.print("After removing element at the head: ");
        ll.printLinkedList();
        System.out.println();
        ll.removeTail();
        System.out.println("After removing the element at the tail: ");
        ll.printLinkedList();
    }
}
