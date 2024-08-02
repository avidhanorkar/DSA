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

    // Method to add the elements in the Linked List
    public void addElem(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        try {
            ll.addElem(60);
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println("Error Occurred: " + e);
        }
    }
}
