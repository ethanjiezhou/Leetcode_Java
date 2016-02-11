public class Solution {
    public boolean canJump(int[] nums) {
        int currentMaxIndex = 0;
        int index = 0;
        for(; index < nums.length; index++) {
            if(index > currentMaxIndex)
                break;

            currentMaxIndex = Math.max(currentMaxIndex, index + nums[index]);
        }
        if(index - 1 == nums.length - 1)
            return true;

        return false;
    }
}