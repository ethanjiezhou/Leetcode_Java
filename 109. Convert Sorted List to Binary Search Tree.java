/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        return buildTree(head);
    }

    public TreeNode buildTree(ListNode head) {
        if(head == null)
            return null;
        if(head != null && head.next == null)
            return new TreeNode(head.val);

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        TreeNode root = new TreeNode(slow.val);
        if(prev != null)
            prev.next = null;
        else
            head = null;

        root.left = buildTree(head);
        root.right = buildTree(slow.next);

        return root;
    }
}