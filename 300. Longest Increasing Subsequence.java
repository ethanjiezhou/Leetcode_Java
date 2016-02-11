// version 1
public class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;

        int[] dp = new int[nums.length];
        int len = 0;
        for(int value : nums) {
            int i = Arrays.binarySearch(dp, 0, len, value);
            if(i < 0)
                i = - i - 1;
            dp[i] = value;
            if(i == len)
                len++;
        }
        return len;
    }
}

// version 2
public class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int max = 1;
        for(int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            for(int j = 0; j < i; j++) {
                if(nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    max = Math.max(max, dp[i]);
                }
            }
        }
        return max;
    }
}