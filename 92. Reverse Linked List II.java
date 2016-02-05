/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || head.next == null || m == n)
            return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode start = dummy;

        for(int i = 1; i <= m; i++) {
            prev = start;
            start = start.next;
        }

        ListNode end = dummy;
        for(int i = 1; i <= n; i++) {
            end = end.next;
        }

        ListNode next = end.next;
        prev.next = null;
        end.next = null;
        reverseList(start);
        prev.next = end;
        start.next = next;
        return dummy.next;


    }

    public void reverseList(ListNode head) {
        if(head == null || head.next == null)
            return;

        ListNode prev = null;
        ListNode curr = head;
        while(head != null) {
            curr = head;
            head = head.next;
            curr.next = prev;
            prev = curr;
        }
    }
}