/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode Head = reverseList(slow);

        while(Head != null) {
            if(head.val != Head.val)
                return false;
            head = head.next;
            Head = Head.next;
        }

        return true;
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