/*
 *
 *
 *
 *
 */
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0)
            return res;

        List<Integer> list = new ArrayList<Integer>();
        dfs(nums, res, list, 0);
        return res;
    }

    public void dfs(int[] nums, List<List<Integer>> res, List<Integer> list, int index) {
        if(index == nums.length) {
            res.add(new ArrayList<Integer>(list));
            return;
        }

        for(int i = 0; i <= index; i++) {
            list.add(i, nums[index]);
            dfs(nums, res, list, index + 1);
            list.remove(i);
        }
    }
}

/*
 *
 *
 *
 *
 */
/*
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();
        if(nums == null || nums.length == 0)
            return res;

        res.add(new LinkedList<Integer>());
        for(int n : nums) {
            int size = res.size();
            for(; size > 0; size--) {
                List<Integer> r = res.pollFirst();
                for(int i = 0; i <= r.size(); i++) {
                    List<Integer> t = new LinkedList<Integer>(r);
                    t.add(i, n);
                    res.add(t);
                }
            }
        }
        return res;
    }
}
*/