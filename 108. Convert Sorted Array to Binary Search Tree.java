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
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length-1);
    }

    public TreeNode buildTree(int[] nums, int s, int e) {
        if(s > e)
            return null;

        int m = s + (e - s) / 2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = buildTree(nums, s, m - 1);
        root.right = buildTree(nums, m + 1, e);

        return root;
    }
}