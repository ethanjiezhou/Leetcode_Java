/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode prev = null;
        ListNode curr = head;
        while(head != null) {
            curr = head;
            head = head.next;
            curr.next = prev;
            prev = curr;
        }
        return curr;
    }
}