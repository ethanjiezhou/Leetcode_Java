public class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];

        return Math.max(helper(nums, 0, nums.length - 2), helper(nums, 1, nums.length - 1));
    }

    private int helper(int[] nums, int s, int e) {
        if(s == e)
            return nums[s];

        int first = 0;
        int second = nums[s];
        int third = 0;
        for(int i = s + 1; i <= e; i++) {
            third = Math.max(nums[i] + first, second);
            first = second;
            second = third;
        }
        return third;
    }
}