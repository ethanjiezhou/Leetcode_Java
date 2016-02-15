public class Solution {
    public void sortColors(int[] nums) {
        int s = 0, e = nums.length - 1, i = 0;

        while(i <= e) {
            if(nums[i] == 0) {
                nums[i] = nums[s];
                nums[s] = 0;
                s++;
            }

            if(nums[i] == 2) {
                nums[i] = nums[e];
                nums[e] = 2;
                e--;
                i--;
            }

            i++;
        }

    }
}

//version 2 slow
public class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
}
