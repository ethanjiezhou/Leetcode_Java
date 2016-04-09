/*
 *
 *
 *
 *
 */
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