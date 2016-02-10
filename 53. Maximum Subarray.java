public class Solution {
    public int maxSubArray(int[] nums) {
        int maxSofar = nums[0];
        int maxEndHere = nums[0];

        for(int i = 1; i < nums.length; i++) {
            maxEndHere = Math.max(nums[i], maxEndHere + nums[i]);
            maxSofar = Math.max(maxSofar, maxEndHere);
        }
        return maxSofar;
    }
}