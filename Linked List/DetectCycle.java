import org.junit.platform.engine.support.hierarchical.Node;

public class DetectCycle {
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

    public static boolean detectCycle(){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void removeLoop() {
        // Detect Cycle
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                break;
            }
        }

        // Get the last Node
        Node prev = null;
        slow = head;
        while (slow != fast){
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }

        // Unlink
        prev.next = null;
    }

    public static void main(String[] args) {
        DetectCycle.addElems(10);
        DetectCycle.addElems(20);
        DetectCycle.addElems(30);
        DetectCycle.addElems(40);
        DetectCycle.addElems(50);
        tail.next = head.next.next.next;
        boolean cycleDetected = DetectCycle.detectCycle();
        DetectCycle.removeLoop();
        DetectCycle.printLL();
    }
}
