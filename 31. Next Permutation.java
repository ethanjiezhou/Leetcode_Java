public class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 1)
            return;

        int index = 0, first = 0, second = 0, third = 0;
        for(int i = nums.length - 1; i > 0; i--) {
            if(nums[i] > nums[i - 1]) {
                first = i - 1;
                second = i;
                break;
            }
        }

        for(int i = nums.length - 1; i > first; i--) {
            if(nums[i] > nums[first]) {
                third = i;
                break;
            }
        }

        int temp = nums[third];
        nums[third] = nums[first];
        nums[first] = temp;

        reverse(nums, second, nums.length - 1);


    }

    public void reverse(int[] nums, int i, int j) {
        if(i > j)
            return;

        while(i < j) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            i++;
            j--;
        }
    }
}