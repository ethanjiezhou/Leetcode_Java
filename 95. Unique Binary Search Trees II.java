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
    public List<TreeNode> generateTrees(int n) {
        if(n == 0)
            return new ArrayList<TreeNode>();

        return generateSubtrees(1, n);
    }

    public List<TreeNode> generateSubtrees(int s, int e) {
        List<TreeNode> list = new ArrayList<TreeNode>();

        if(s > e) {
            list.add(null);
            return list;
        }

        for(int i = s; i <= e; ++i) {
            List<TreeNode> leftSubTrees = generateSubtrees(s, i-1);
            List<TreeNode> rightSubTrees = generateSubtrees(i+1, e);

            for(TreeNode left : leftSubTrees) {
                for(TreeNode right : rightSubTrees) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    list.add(root);
                }
            }
        }

        return list;
    }
}