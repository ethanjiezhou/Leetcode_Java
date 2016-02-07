public class Solution {
    public int rob(int[] nums) {
        int k = nums.length;
        if(k == 0)
            return 0;
        int[] money = new int[k + 1];
        money[0] = 0;
        money[1] = nums[0];
        for(int i = 2; i < k + 1; i++) {
            money[i] = nums[i - 1] + money[i - 2] >= money[i - 1] ? nums[i - 1] + money[i - 2] : money[i - 1];
        }
        return money[k];
    }
}

public class Solution {
    public int rob(int[] nums) {
        int k = nums.length;
        if(k == 0)
            return 0;

        int notRob = 0;
        int rob = nums[0];
        int current = nums[0];

        for(int i = 1; i < k; i++) {
            current = nums[i] + notRob >= rob ? nums[i] + notRob : rob;
            notRob = rob;
            rob = current;
        }
        return current;
    }
}