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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode head = l3;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                head.next = l1;
                l1 = l1.next;
            } else {
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }

        if (l1 == null && l2 != null) {
            head.next = l2;
            l2 = l2.next;
        } else if (l1 != null && l2 == null) {
            head.next = l1;
            l1 = l1.next;
        }
        return l3.next;
    }
}

public class MergeSortedList {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);

        ListNode result = solution.mergeTwoLists(l1, l2);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
