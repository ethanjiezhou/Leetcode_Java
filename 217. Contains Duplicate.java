public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length <= 1)
            return false;

        Set<Integer> set = new HashSet<Integer>();
        for(int value : nums) {
            if(!set.add(value))
                return true;
        }

        return false;
    }
}