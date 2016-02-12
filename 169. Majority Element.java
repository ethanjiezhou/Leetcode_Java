public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}

public class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for(int value : nums) {
            if(count == 0) {
                candidate = value;
                count++;
            } else if(candidate == value) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}