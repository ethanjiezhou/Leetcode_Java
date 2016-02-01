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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, inorder, 0, inorder.length - 1);
    }

    public TreeNode buildTree(int[] preorder, int preStart, int[] inorder, int inStart, int inEnd) {
        if(preStart > preorder.length - 1 || inStart > inEnd)
            return null;

        TreeNode root = new TreeNode(preorder[preStart]);
        int index = 0;
        for(int i = inStart; i <= inEnd; i++) {
            if(inorder[i] == preorder[preStart]) {
                index = i;
                break;
            }
        }

        root.left = buildTree(preorder, preStart + 1, inorder, inStart, index - 1);
        root.right = buildTree(preorder, preStart + (index - inStart) + 1, inorder, index + 1, inEnd);
        return root;
    }
}