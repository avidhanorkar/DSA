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

    // Method to search a key iteratively in the linked list
    public static int searchIteratively(int key){
        int i = 0;
        Node temp = head;
        while (temp.next != null) {
            if (temp.data == key){
                return i;
            } else {
                i++;
                temp = temp.next;
            }
        }
        return -1;
    }

    // Method to search a key recursively in the linked list
    public static int searchRecursively(int key, Node node, int i){
        if (node == null){
            return -1;
        }
        if (key == node.data){
            return i;
        }
        return searchRecursively(key, node.next, i+1);
    }

    // Method to reverse a linked list
    public static void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Method to find and remove the nth element in the Linked List
    public static int removeNth(int n){
        Node temp = head;
        int i = 0;
        while (temp != null){
            if (temp.next == null){
                return -1;
            } else if (i == n-2) {
                temp.next = temp.next.next;
                return i;
            } else {
                temp = temp.next;
                i++; 
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Adding elements
        LinkedList.addElemAtFirst(10);
        LinkedList.addElemAtFirst(20);
        LinkedList.addElemAtFirst(30);
        LinkedList.addElemAtLast(40);
        LinkedList.addElemAtLast(50);
        LinkedList.addElemAtRandom(2, 25);
        // Printing Linked List
        LinkedList.printLinkedList();
        // Printing Size of linked list
        System.out.println("Size of the Linked List is: " +LinkedList.size);
        // Removing the head of the linked list
        LinkedList.removeHead();
        System.out.print("After removing element at the head: ");
        LinkedList.printLinkedList();
        System.out.println();
        // Removing the tail of the linked list
        LinkedList.removeTail();
        System.out.println("After removing the element at the tail: ");
        LinkedList.printLinkedList();
        // Searching Iteratively
        int key = 10;
        int idx = searchIteratively(key);
        System.out.println("The key: " + key + " is at the index: " + idx);
        // Search Recursively
        int recIdx = searchRecursively(10, head, 0);
        System.out.println("The key: " + key + " is at the index: " + recIdx);
        // Reversing the linked list 
        LinkedList.reverse();
        System.out.print("After reversing the linked list: ");
        LinkedList.printLinkedList();
        System.out.println();
        // Removing the nth node from the end
        int n = 2;
        int idxN = removeNth(n);
        System.out.println("The element at the nth position from the end is: " + idxN);
        LinkedList.printLinkedList();
    }
}
