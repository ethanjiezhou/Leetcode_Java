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

// 2 pass
public class Solution {
    public void sortColors(int[] nums) {
        // 2-pass
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {count0++;}
            if (nums[i] == 1) {count1++;}
            if (nums[i] == 2) {count2++;}
        }
        for(int i = 0; i < nums.length; i++) {
            if (i < count0) {nums[i] = 0;}
            else if (i < count0 + count1) {nums[i] = 1;}
            else {nums[i] = 2;}
        }
    }
}

//version 2 slow
public class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
}

//