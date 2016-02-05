/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode first = head;
        ListNode second = head.next;

        int temp = second.val;
        second.val = first.val;
        first.val = temp;

        while(second.next != null && second.next.next != null) {
            first = first.next.next;
            second = second.next.next;

            temp = second.val;
            second.val = first.val;
            first.val = temp;
        }

        return head;
    }
}