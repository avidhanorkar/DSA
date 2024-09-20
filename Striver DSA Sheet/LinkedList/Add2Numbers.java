
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newNode = new ListNode(0);
        ListNode head = newNode;
        int cary = 0;

        while (l1 != null || l2 != null) {
            int add = cary;

            if (l1 != null) {
                add = add + l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                add = add + l2.val;
                l2 = l2.next;
            }

            cary = add / 10;
            head.next = new ListNode(add % 10);
            head = head.next; 
        }

        if (cary != 0) {
            int n = cary % 10;
            head.next = new ListNode(n);
            cary = cary / 10;
        }

        return newNode.next;
    }
}

public class Add2Numbers{
    
    public static void main(String[] args) {
        Solution solution = new Solution();
    
        // Create the first linked list: 2 -> 4 -> 3
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
    
        // Create the second linked list: 5 -> 6 -> 4
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
    
        // Add the two numbers
        ListNode result = solution.addTwoNumbers(l1, l2);
    
        // Print the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();
    }
}