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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, inorder.length - 1, 0, postorder, postorder.length - 1);
    }

    public TreeNode buildTree(int[] inorder, int inEnd, int inStart, int[] postorder, int postEnd) {
        if(inEnd < inStart || postEnd < 0)
            return null;

        TreeNode root = new TreeNode(postorder[postEnd]);
        int index = 0;
        for(int i = inEnd; i >= inStart; i--) {
            if(postorder[postEnd] == inorder[i]) {
                index = i;
                break;
            }
        }
        root.right = buildTree(inorder, inEnd, index + 1, postorder, postEnd - 1);
        root.left = buildTree(inorder, index - 1, inStart, postorder, postEnd - (inEnd - index) - 1);
        return root;
    }
}