// Check if the Linked List is a Palindrome or not

public class QueLL {
    
    static class Node {
        int data;
        Node next; 

        Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    static Node tail;

    public static void addElems(int data){
        if (head == null){
            head = tail = new Node(data);
        } else {
            Node temp = new Node (data);
            temp.next = head;
            head = temp;
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

    // Finding the mid of the Linked List
    public static Node findMid (Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Reversing the 2nd half
    public static void reverse2ndHalf(Node head){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public static boolean checkPalindrome(){
        if (head == null || head.next == null){
            return true;
        }

        // Mid Node
        Node mid = findMid(head);

        // Reverse the 2nd Half:
        Node prev = null;
        Node curr = mid;
        Node next;
      
        while (curr != null) {
          next = curr.next;
          curr.next = prev;
          prev = curr;
          curr = next;
        }
        
        tail = prev;

        Node right = prev;
        Node left = head;

        // Check if Palindrome
        while (right != null){
            if (left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        QueLL.addElems(1);
        QueLL.addElems(2);
        QueLL.addElems(3);
        QueLL.addElems(2);
        QueLL.addElems(1);
        QueLL.printLL();
        System.out.println("The statement of the given linkedlist being a palindrome is: " + QueLL.checkPalindrome());
    }
}
