public class Solution {
    public int findMin(int[] nums) {
        int i = 0, j = nums.length - 1;
        while(i < j) {
            int mid = (i + j) / 2;

            if(nums[mid] > nums[j]) {
                i = mid + 1;
            } else{
                j = mid;
            }
        }

        return Math.min(nums[i], nums[j]);
    }
}


public class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int value : nums) {
            min = Math.min(min, value);
        }
        return min;
    }
}
