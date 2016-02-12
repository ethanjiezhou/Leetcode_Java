public class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length <= 1)
            return;

        int insertPos = 0;
        for(int value : nums) {
            if(value != 0)
                nums[insertPos++] = value;
        }

        while(insertPos < nums.length)
            nums[insertPos++] = 0;

    }
}