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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        helper(root, 0, list);
        return list;
    }

    private void helper(TreeNode root, int level, List<Integer> list) {
        if(root == null)
            return;
        if(list.size() == level)
            list.add(root.val);
        helper(root.right, level + 1, list);
        helper(root.left, level + 1, list);
    }
}