public class Solution {
    public int missingNumber(int[] nums) {
        int index = nums.length;
        for(int i = 0; i < nums.length; i++) {
            index -= nums[i] - i;
        }
        return index;
    }
}

// version 2
public class Solution {
    public int missingNumber(int[] nums) {
        int sum = (0 + nums.length) * (nums.length + 1) / 2;
        for(int value : nums) {
            sum -= value;
        }
        return sum;
    }
}


// version 3
public class Solution {
    public int missingNumber(int[] nums) {

        int xor = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }

        return xor ^ i;
    }
}

//version 4
public class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;
        for(int i = 0; i <= nums.length; i++) {
            xor ^= i;
        }

        for(int value : nums) {
            xor ^= value;
        }
        return xor;
    }
}
