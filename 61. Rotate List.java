/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
            return head;

        int L = 1;
        ListNode tail = head;
        while(tail.next != null) {
            tail = tail.next;
            L++;
        }

        k = k < L ? k :  k % L;

        if(k == 0)
            return head;


        ListNode curr = head;
        ListNode prev = head;
        for(int i = 1; i <= L - k; i++) {
            prev = curr;
            curr = curr.next;
            prev.next = null;
            tail.next = prev;
            tail = tail.next;
        }

        return curr;
    }
}