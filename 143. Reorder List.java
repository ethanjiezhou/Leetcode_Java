/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null)
            return;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode Head = reverseList(slow);

        ListNode point = head;
        while(head != null) {
            head = head.next;
            point.next = Head;
            Head = Head.next;
            point  = point.next;
            if(head != null) {
                point.next = head;
                point = point.next;
            }
        }


    }

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