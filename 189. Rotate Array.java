public class Solution {
    public void rotate(int[] nums, int k) {
        if(k % nums.length == 0)
            return;

        k = k % nums.length;
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    public void reverse(int[] nums, int begin, int end) {
        if(begin > end)
            return;

        while(begin < end) {
            int temp = nums[end];
            nums[end] = nums[begin];
            nums[begin] = temp;
            begin++;
            end--;
        }
    }
}