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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> currentList = new ArrayList<Integer>();

        helper(root, list, currentList, sum);
        return list;
    }

    public void helper(TreeNode root, List<List<Integer>> list, List<Integer> currentList, int sum) {
        if(root == null)
            return;

        currentList.add(root.val);
        if(root.left == null && root.right == null && sum == root.val) {
            list.add(new ArrayList<Integer>(currentList));
            currentList.remove(currentList.size()-1);
            return;
        }

        helper(root.left, list, currentList, sum - root.val);
        helper(root.right, list, currentList, sum - root.val);

        currentList.remove(currentList.size()-1);
    }
}