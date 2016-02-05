/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return head;

        int k = 1;
        ListNode tail = head;
        while(tail.next != null) {
            tail = tail.next;
            k++;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = dummy;

        for(int i = 0; i <= k - n; i++) {
            prev = curr;
            curr = curr.next;
        }

        if(curr == tail) {
            prev.next = null;
        } else {
            prev.next = curr.next;
        }

        return dummy.next;
    }
}