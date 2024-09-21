public class LinkedListCycle {
    
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode fastNode = head;
            ListNode slowNode = head;

            while (fastNode != null && fastNode.next != null) {
                slowNode = slowNode.next;
                fastNode = fastNode.next.next;
                if (slowNode == fastNode) {
                    return true;
                }
            }

            return false;
        }
    }

    public static void main(String[] args) {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        Solution solution = linkedListCycle.new Solution();

        // Create a linked list with a cycle: 1 -> 2 -> 3 -> 4 -> 2
        ListNode head = linkedListCycle.new ListNode(1);
        head.next = linkedListCycle.new ListNode(2);
        head.next.next = linkedListCycle.new ListNode(3);
        head.next.next.next = linkedListCycle.new ListNode(4);
        head.next.next.next.next = head.next; // Create a cycle

        // Check if the linked list has a cycle
        boolean hasCycle = solution.hasCycle(head);
        System.out.println("Has cycle: " + hasCycle);

        // Create a linked list without a cycle: 1 -> 2 -> 3 -> 4
        head = linkedListCycle.new ListNode(1);
        head.next = linkedListCycle.new ListNode(2);
        head.next.next = linkedListCycle.new ListNode(3);
        head.next.next.next = linkedListCycle.new ListNode(4);

        // Check if the linked list has a cycle
        hasCycle = solution.hasCycle(head);
        System.out.println("Has cycle: " + hasCycle);
    }
}