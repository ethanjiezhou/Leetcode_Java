/*
 *
 *
 *
 *
 */
public class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 1){
            return;
        }
        
        int length = nums.length, first = -1, second = 0, third = 0;
        for(int i = length - 1; i > 0; i--) {
            if(nums[i] > nums[i-1]) {
                first = i - 1;
                second = i;
                break;
            }
        }
        
        if(first == -1) { // if first == -1, this sequence is the last one, reverse all
            reverse(nums, first + 1, length-1);
            return;
        }
        
        // find the element that is greater than first
        for(int i = length - 1; i > first; i--){
            if(nums[i] > nums[first]) {
                third = i;
                break;
            }
        }

        // swap two elements
        swap(nums, first, third);
        
        // reverse the following elements;
        reverse(nums, second, length - 1);
    }
    
    // swap array at index iIndex and jIndex
    public void swap(int[] nums, int iIndex, int jIndex){
        int temp = nums[iIndex];
        nums[iIndex] = nums[jIndex];
        nums[jIndex] = temp;
    }
    
    // reverse array from startIndex to endIndex
    public void reverse(int[] nums, int startIndex, int endIndex){
        while(startIndex < endIndex) {
            swap(nums, startIndex, endIndex);
            startIndex++;
            endIndex--;
        }
    }
}