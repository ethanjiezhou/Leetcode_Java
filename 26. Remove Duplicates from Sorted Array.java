public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length <= 1)
            return nums.length;

        int insertPos = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1])
                nums[insertPos++] = nums[i];
        }
        return insertPos;
    }
}