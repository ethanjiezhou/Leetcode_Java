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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        if(root == null)
            return list;
        helper(root, "", list);
        return list;
    }

    public void helper(TreeNode root, String currentString, List<String> list) {
        if(root.left == null && root.right == null)
            list.add(currentString + root.val);
        if(root.left != null)
            helper(root.left, currentString + root.val + "->", list);
        if(root.right != null)
            helper(root.right, currentString + root.val + "->", list);
    }
}