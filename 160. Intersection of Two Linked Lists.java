/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;

        int a = getLength(headA);
        int b = getLength(headB);
        int k = 0;
        if(a > b) {
            k = a - b;
            while(k > 0){
                headA = headA.next;
                k--;
            }
        } else if(a < b) {
            k = b - a;
            while(k > 0) {
                headB = headB.next;
                k--;
            }
        }

        while(headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        if(headA == headB)
            return headA;

        return null;

    }

    private int getLength(ListNode head) {
        if(head == null)
            return 0;
        int k = 1;
        ListNode temp = head;
        while(temp.next != null) {
            temp = temp.next;
            k++;
        }
        return k;
    }
}