/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null)
            return head;

        int l = 1;
        ListNode tail = head;
        while(tail.next != null) {
            tail = tail.next;
            l++;
        }
        ListNode curr = head;
        ListNode prev = null;
        for(int i = 1; i <= l; i++) {
            if(i % 2 == 1) {
                prev = curr;
                curr = curr.next;
            } else {
                prev.next = curr.next;
                tail.next = curr;
                tail = tail.next;
                tail.next = null;
                curr = prev.next;
            }
        }

        return head;
    }
}