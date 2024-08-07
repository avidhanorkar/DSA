public class MergeSortInLL{

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

    public static Node merge(Node leftHead, Node rightHead){
        Node mergedLL = new Node(Integer.MIN_VALUE);
        Node temp = mergedLL;
        
        while (leftHead != null && rightHead != null){
            if (leftHead.data <= rightHead.data){
                temp.next = leftHead;
                leftHead = leftHead.next;
                temp = temp.next;
            } else {
                temp.next = rightHead;
                rightHead = rightHead.next;
                temp = temp.next;
            }
        }
        while (leftHead != null){
            temp.next = leftHead;
            leftHead = leftHead.next;
            temp = temp.next;
        } 

        while (rightHead != null) {
            temp.next = rightHead; 
            rightHead = rightHead.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public static Node mergeSort( Node head){
        if (head == null || head.next == null){
            return head;
        }
        //find mid recursively and create the sublinkedlists
        Node mid = findMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // Merge 
        return merge(newLeft, newRight);
    }

    public static Node findMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }


    public static void main(String[] args) {
        MergeSortInLL.addElems(10);
        MergeSortInLL.addElems(69);
        MergeSortInLL.addElems(0);
        MergeSortInLL.addElems(20);
        MergeSortInLL.addElems(7);
        MergeSortInLL.printLL();
        System.out.println("Sorting the linked List");
        MergeSortInLL.head = MergeSortInLL.mergeSort(head);
        MergeSortInLL.printLL();
    }    
}