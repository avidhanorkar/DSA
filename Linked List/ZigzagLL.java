public class ZigzagLL {
    static class Node {
        int data;
        Node next; 
        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head, tail;

    static void addElems(int data){
        Node temp = new Node(data);
        if (head == null){
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    public static void printLL (){
        Node temp = head;
        if (head == null){
            System.out.println("The Linked List is Empty.");
        } else {
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        } System.out.println();
    }

    public static Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static Node reverseLL(Node head){
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

        return head;
    }

    public static Node zigZag(Node head){
        // Get Mid and Unlink
        Node mid = findMid(head);
        Node rightHead = mid.next;
        mid.next = null; // unlinked

        // reversing the 2nd half of the Linked List
        Node reversedhead = reverseLL(rightHead);

        Node zigZagggg = new Node(-1);
        Node temp = zigZagggg;
        while (head != null || reversedhead != null){
            if (head != null){
                temp.next = head;
                head = head.next;
                temp = temp.next;
            }
            if (reversedhead != null){
                temp.next = reversedhead;
                reversedhead = reversedhead.next;
                temp = temp.next;
            }
        }

        return zigZagggg.next;
    }


    public static void main(String[] args) {
        ZigzagLL.addElems(0);
        ZigzagLL.addElems(10);
        ZigzagLL.addElems(20);
        ZigzagLL.addElems(30);
        ZigzagLL.addElems(40);
        ZigzagLL.addElems(50);
        ZigzagLL.printLL();

        System.out.println("Printing the Linked List in Zigzag Manner: ");
        ZigzagLL.zigZag(ZigzagLL.head);
        ZigzagLL.printLL();
    }
}
