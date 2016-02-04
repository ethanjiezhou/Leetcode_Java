/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null)
            return l1 == null ? l2 : l1;

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carrier = 0;
        while(l1 != null && l2 != null) {
            curr.next = new ListNode(l1.val + l2.val + carrier);
            curr = curr.next;
            if(curr.val >= 10) {
                carrier = curr.val / 10;
                curr.val = curr.val % 10;
            } else {
                carrier = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        if(l1 != null) {
            while(l1 != null) {
                curr.next = new ListNode(l1.val + carrier);
                curr = curr.next;
                if(curr.val >= 10) {
                    carrier = curr.val / 10;
                    curr.val = curr.val % 10;
                } else {
                    carrier = 0;
                }
                l1 = l1.next;
            }
        }


        if(l2 != null) {
            while(l2 != null) {
                curr.next = new ListNode(l2.val + carrier);
                curr = curr.next;
                if(curr.val >= 10) {
                    carrier = curr.val / 10;
                    curr.val = curr.val % 10;
                } else {
                    carrier = 0;
                }
                l2 = l2.next;
            }
        }

        if(carrier > 0)
            curr.next = new ListNode(carrier);

        return dummy.next;
    }
}