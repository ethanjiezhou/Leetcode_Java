public class Solution {
    public int searchInsert(int[] nums, int target) {
        int position = -1;
        for(int i = 0; i < nums.length; i++) {
            if(target <= nums[i]) {
                position = i;
                break;
            }
        }
        if(position == -1)
            return nums.length;

        return position;
    }
}


public class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = Arrays.binarySearch(nums, 0, nums.length, target);
        if(i < 0)
            return -i - 1;
        return i;
    }
}