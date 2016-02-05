/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode dummy = new ListNode(head.val - 1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        boolean gap = false;

        while(curr != null) {
            if(curr.next == null && gap == true) {
                prev.next = null;
                break;
            } else if(curr.next == null && gap == false) {
                break;
            }

            if(curr.val != curr.next.val && curr.val != prev.val) {
                if(gap == false) {
                    prev = curr;
                    curr = curr.next;
                } else {
                    prev.next = curr.next;
                    curr = curr.next;
                    gap = false;
                }
            } else if(curr.val == curr.next.val) {
                curr = curr.next;
                gap = true;
            }
        }

        return dummy.next;
    }
}