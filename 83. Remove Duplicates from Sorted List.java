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

        ListNode curr = head.next;
        ListNode stop = head;
        boolean gap = false;

        while(curr != null) {
            if(curr.val != stop.val) {
                if(gap) {
                    stop.next = curr;
                    stop = curr;
                    curr = curr.next;
                    gap = false;
                } else {
                    stop = curr;
                    curr = curr.next;
                }
            } else {
                curr = curr.next;
                gap = true;
            }
        }

        if(gap)
            stop.next = null;

        return head;
    }
}