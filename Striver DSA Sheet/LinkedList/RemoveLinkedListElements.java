
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode Node = new ListNode(0);
        Node.next = head;
        ListNode Inspector = Node;

        while (Inspector.next != null) {
            if (Inspector.next.val == val) {
                Inspector.next = Inspector.next.next;
            } else {
                Inspector = Inspector.next;
            }
        }

        return Node.next;
    }
}

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Remove elements with value 3
        head = solution.removeElements(head, 3);

        // Print the resulting linked list
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}