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
    public int countNodes(TreeNode root) {
        if(root == null)
            return 0;

        int left = leftDepth(root);
        int right = rightDepth(root);

        if(left == right) {
            return (1<<left) - 1;
        } else {
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }

    private int leftDepth(TreeNode root) {
        int dep = 0;
        while(root != null) {
            root = root.left;
            dep++;
        }
        return dep;
    }

    private int rightDepth(TreeNode root) {
        int dep = 0;
        while(root != null) {
            root = root.right;
            dep++;
        }
        return dep;
    }
}